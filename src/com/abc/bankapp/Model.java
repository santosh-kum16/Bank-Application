package com.abc.bankapp;

import java.sql.*;
import java.util.ArrayList;

public class Model {
	
	private String name;
	private int accno;
	private int racno;
	private int balance;
	private String custid;
	private String pwd;
	private String email;
	private Connection con = null;
	private PreparedStatement pstmt =null;
	private ResultSet res =null;
	private ArrayList<Integer> arrayList;
	private String first_name;
	private String last_name;
	private int loan_amount;
	private int interest;
	private String loan_type;
	private int salary;
	private int time_duration;
	private String occupation;

	
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(int loan_amount) {
		this.loan_amount = loan_amount;
	}

	public int getInterest() {
		return interest;
	}

	public void setInterest(int interest) {
		this.interest = interest;
	}

	public String getLoan_type() {
		return loan_type;
	}

	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getTime_duration() {
		return time_duration;
	}

	public void setTime_duration(int time_duration) {
		this.time_duration = time_duration;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

			public ArrayList<Integer> getArrayList() 
		{
			return arrayList;
		}

		public void setArrayList(ArrayList<Integer> arrayList) 
		{
			this.arrayList = arrayList;
		}

		public String getName() 
		{
			return name;
		}

		public void setName(String name) 
		{
			this.name = name;
		}

		public int getAccno() 
		{
			return accno;
		}

		public void setAccno(int accno) 
		{
			this.accno = accno;
		}

		public int getBalance() 
		{
			return balance;
		}

		public void setBalance(int balance) 
		{
			this.balance = balance;
		}

		public String getCustid() 
		{
			return custid;
		}

		public void setCustid(String custid) 
		{
			this.custid = custid;
		}

		public String getPwd() 
		{
			return pwd;
		}

		public void setPwd(String pwd) 
		{
			this.pwd = pwd;
		}

		public String getEmail() 
		{
			return email;
		}

		public void setEmail(String email) 
		{
			this.email = email;
		}

		
		public int getRacno() 
		{
			return racno;
		}

		public void setRacno(int racno) 
		{
			this.racno = racno;
		}

		Model()
		{
			try 
			{
				Class.forName("oracle.jdbc.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
			} 
			catch (ClassNotFoundException | SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
		public boolean login()
		{
			try 
			{
				pstmt  = con.prepareStatement("select * from SWISS_BANK where CUSTID = ? and PWD = ?");
				pstmt.setString(1,custid);
				pstmt.setString(2,pwd);
				res = pstmt.executeQuery();
				
				if(res.next())
				{
					accno = res.getInt("ACCNO");
					name = res.getString("NAME");
					return true;
					
				}
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			finally
			{
				try 
				{
					if(res!=null)
						res.close();
					if(pstmt!=null)
						pstmt.close();
				}
				catch(SQLException e) 
				{
					e.printStackTrace();
				}
			}
			return false;
		}
		
		public boolean checkBalance()
		{
			try 
			{
				pstmt  = con.prepareStatement("select * from SWISS_BANK where accno=?");
				pstmt.setInt(1, accno);
				res=pstmt.executeQuery();
				if(res.next())
				{
					balance=res.getInt("BALANCE");
					return true;
				}
				
				
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
			finally
			{
				try 
				{
					if(res!=null)
						res.close();
					if(pstmt!=null)
						pstmt.close();
				}
				catch(SQLException e) 
				{
					e.printStackTrace();
				}
			}
			return false;
			
		}
		
		public boolean changePassword()
		{
			try
			{
				pstmt=con.prepareStatement("UPDATE SWISS_BANK SET pwd=? WHERE accno=?");
				pstmt.setString(1, pwd);
				pstmt.setInt(2,accno);
				int result =pstmt.executeUpdate();
				
				if(result==1)
				{
					return true;
				}
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				try
				{
					if(pstmt!=null)
						pstmt.close();
					if(con!=null)
						con.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			return false;
			
		}
		
		public boolean loanDetails()
		{
			try
			{
				pstmt =con.prepareStatement("insert into LOAN_DETAILS values(?,?,?,?,?,?,?,?,?)");
				pstmt.setString(1, first_name);
				pstmt.setString(2, last_name);
				pstmt.setInt(3, loan_amount);
				pstmt.setInt(4, interest);
				pstmt.setString(5, loan_type);
				pstmt.setInt(6, time_duration);
				pstmt.setInt(7 , accno);
				pstmt.setInt(8, salary);
				pstmt.setString(9, occupation);
				int result=pstmt.executeUpdate();
				
				if(result==1)
				{
					return true;
				}
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
				
			finally
			{
				try
				{
					if(pstmt!=null)
						pstmt.close();
					if(con!=null)
						con.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
				
			return false;
			
		}

		
		public boolean transfer()
		{
			try 
			{
				pstmt = con.prepareStatement("update swiss_bank set balance=balance-? where accno=?");
				pstmt.setInt(1, balance);
				pstmt.setInt(2, accno);
				int qry1 = pstmt.executeUpdate();
				
				if(qry1==1)
				{
					pstmt = con.prepareStatement("update swiss_bank set balance=balance+? where accno=?");
					pstmt.setInt(1, balance);
					pstmt.setInt(2, racno);
					int qry2 = pstmt.executeUpdate();
					
					if(qry2==1)
					{
						pstmt = con.prepareStatement("insert into STATEMENT values(?,?)");
						pstmt.setInt(1, accno);
						pstmt.setInt(2, (balance*-1));
						int qry3 = pstmt.executeUpdate();
						
						if(qry3 ==1)
						{
							pstmt = con.prepareStatement("insert into STATEMENT values(?,?)");
							pstmt.setInt(1, racno);
							pstmt.setInt(2, balance);
							int qry4 = pstmt.executeUpdate();
							
							if(qry4 == 1)
								return true;
						}
					}
				}
			}
		
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				try
				{
					if(pstmt!=null)
						pstmt.close();
					if(con!=null)
						con.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			return false;
		}
		
		
		public void getStatement()
		{
			try {
				pstmt = con.prepareStatement("select * from STATEMENT where accno=?");
				pstmt.setInt(1, accno);
				res = pstmt.executeQuery();
				arrayList = new ArrayList<Integer>();
				while(res.next())
				{
					arrayList.add(res.getInt("AMT"));
				}
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
		
	}

