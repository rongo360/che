package com.pb.che.context;



public class CurrentUserContext
{

	private  static ThreadLocal<UserDomain> threadLocal=new ThreadLocal<UserDomain>();
	
	
	public  static void  save(UserDomain user){
		
		threadLocal.set(user);
	}
	
	

	public  static UserDomain  get(){
		
		return threadLocal.get();
	}
	
}
