public class Date212 {

   private int day;
   private int month;
   private int year;

   public Date212(String date) {
		 if(date.length() != 8) {
			   throw new Date212Exception("invalid input, must be 8 characters long.");
		   }
	   this.year = Integer.parseInt(date.substring(0, 4));
		this.day = Integer.parseInt(date.substring(6,8));
		this.month = Integer.parseInt(date.substring(4,6));

   }//constructor- Needed to parseInt in order to change the string into an integer.
   
   public String convertMonth(int monthNum){
      String month ="";
      switch(new Integer(monthNum).intValue()){
      case 1:
	  month= "January";
         break;
      case 2:
	  month= "February";
         break;
      case 3:
	  month= "March";
         break;
      case 4:
	  month= "April";
         break;
      case 5:
	  month= "May";
         break;
      case 6:
	  month= "June";
         break;
      case 7:
	  month= "July";
         break;
      case 8:
	  month= "August";
         break;
      case 9:
	  month= "September";
         break;
      case 10:
	  month= "October";
         break;
      case 11:
      month= "November";
         break;
      case 12:
	  month= "December";
         break;
      }
   return month;
   } /*method convertMonth- checks for the value of the month is as an integer and changes it to its correct
   	   corresponding month as a string.
   */
   public int getDay() {
	      return day;
	   }
	   public int getMonth() {
	      return month;
	   }
	   public int getYear() {
		  return year;
		   }
	   public void setDay(int day) {
		  this.day = day;
		   }
	   public void setMonth(int month) {
	      this.month = month;
	   }
	   public void setYear(int year) {
	      this.year = year;
	   }
	   
   public String toString() {
      return this.convertMonth(this.getMonth()) + " " + this.getDay() + "," + this.getYear();
   }// returns the answer in a string format in order to be displayed
   public boolean equals(Date212 a) {
      if (this.getDay() == a.getDay() && this.getMonth() == a.getMonth() && this.getYear() == a.getYear()) {
      return true;
      }
   return false;
   }//equals method which checks if their are any duplicate dates and returns a boolean value
   public String compareTo(Date212 a) {
      if (this.getDay() == a.getDay() && this.getMonth() == a.getMonth() && this.getYear() == a.getYear()) {
      return "Both are same";
      }
   if (this.getYear() > a.getYear()) {
      return this.toString() + " greater than " + a.toString();
   }
   else if (this.getYear() < a.getYear()) {
      return this.toString() + " lesser than " + a.toString();
   }
   else {
      if (this.getMonth() > a.getMonth()) {
      return this.toString() + " greater than " + a.toString();
   }
   else if (this.getMonth() < a.getMonth()) {
      return this.toString() + " lesser than " + a.toString();
   } 
   else {
      if (this.getDay() > a.getDay()) {
         return this.toString() + " greater than " + a.toString();
   }
   else if (this.getDay() < a.getDay()) {
      return this.toString() + " lesser than " + a.toString();
      }
   }
   }
   return "";
   } // compareTo method- Compared to the equals method this method checks if the dates are less than or greater than.
}
