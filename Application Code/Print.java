public class Print { 
	String Username;
    String Password;
    String Email;
    String Fullname;
    String Bedtime;
    String Waketime;
    String Event;
    String Day;
    String startDay;
    String startHour;
    String endDay;
    String endHour;
    String Location;
    String classname;
    String dueHour;
    String Hours;
    String Priority;
    Client r = new Client();
   
       
        public void setUsername(String value) {
		Username = value;
	}

        public void setPassword(String value) {
		Password = value;
	}

        public void setEmail(String value) {
    	Email = value;
    }
        
        public void setFullname(String value) {
    	Fullname = value;
    }
        
        public void setBedtime(String value) {
    	Bedtime = value;
    }
        
        public void setWaketime(String value){
        Waketime = value;
    }
        
        public void setEvent(String value) {
        Event = value;
    }
        
        public void setDay(String value) {
        Day = value;
    }
        
        public void setstartDay(String value) {
        startDay = value;
    }
        
        public void setstartHour(String value) {
        startHour = value;
    }
        
        public void setendDay(String value) {
        endDay = value;
    }
    
        public void setendHour(String value) {
        endHour = value;
    }
        
        public void setLocation(String value) {
        Location = value;
    }
        
        public void setClassname(String value) {
        classname = value;
    }
        
        public void setDueHour(String value) {
        dueHour = value;
    }
        
        public void setHours(String value) {
        Hours = value;
    }
        
        public void setPriority(String value) {
        Priority = value;
    }
        
        public void printLogin() {
        	r.createAccount(Username,Fullname,Email,Password,Bedtime,Waketime);	
       	    System.out.print(r.login(Username,Password));
          
    }
        
        public void printAccount() {
        	 r.createAccount(Username,Fullname,Email,Password,Bedtime,Waketime);
        	 r.login(Username,Password);
        	 System.out.print(r.getuserName());
        	 System.out.print(r.getName());
        	 System.out.print(r.getEmail());
        	 System.out.print(r.getBedtime());
        	 System.out.print(r.getWaketime());
    }
 /*       
       public void printAddEvent() {
    	   r.createAccount(Username,Fullname,Email,Password,Bedtime,Waketime);
      	   r.login(Username,Password);
      	   System.out.print(r.addEvent(Event,Day,startDay,startHour,endDay,endHour,Location));
    }
        
        public void printAddAssign() {
            System.out.print(name);
            System.out.print(classname);
            System.out.print(Day);
            System.out.print(due);
            System.out.print(hours);
            System.out.print(priority);
    }
        
     */   
        
        
    
}