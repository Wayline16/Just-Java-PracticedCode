///////////////////Searching through an Array///////////////////
public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (int i = 0; i < cars.length; i++) {
    if (cars[i] == "BMW"){
      System.out.println("We found the BMW");
      }
    }
  }
}

///////////////////Searching through a 2D Array///////////////////
public class Main {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers[0].length; i++) {
    if ((myNumbers[0][i]) == 5){
      System.out.println("We found the BMW");
      }
      else{
      System.out.println("We found the Wayline");
      }
    }

  }
}

///////////////////Coverting a sentence to an Array///////////////////
public class Main {
 
 public static void main(String args[]){
 
 //String which we want to convert to String array
 String str = "Java String to String Array Example";
 

 
 String strArray[] = str.split(" ");
 
 System.out.println("String converted to String array");
 
 //variable that I am going to use to store the sentence from the array.
 String normal = "";
 
 //print elements of String array
 for(int i=0; i < strArray.length; i++){

 normal = normal + strArray[i] + " "  ;

 System.out.println(strArray[i]);

 }
  System.out.println(normal);
 }
 
}


///////////////////Coverting a sentence to an Array and Reversed///////////////////
public class Main {
 
 public static void main(String args[]){
 
 //String which we want to convert to String array
 String normal = "Java String to String Array Example";
 
 
 
 String strArray[] = normal.split(" ");
 
 System.out.println("String converted to String array and displayed backwards");
 
 //variable that I am going to use to store the reversed sentence
 String reversed = "";
 
 //print elements of String array
 for(int i=strArray.length -1 ; i>=0; i--){
 System.out.println(strArray[i]);
 reversed = reversed + strArray[i] + " ";
 }
 System.out.println(reversed);

}
}


///////////////////Converting a word into an Array///////////////////
public class Main {
 
 public static void main(String args[]){
 
 //String which we want to convert to String array
 String str = "Wayline";
 

 char[] ch = new char[str.length()];

 
 System.out.println("Word converted to String array");
 

 
 //Copying character by character into array
 for(int i=0; i < str.length(); i++){
	ch[i] = str.charAt(i);

 }
 
 //Printing out the Array
  for (char c : ch) {
            System.out.println(c);
        }
 }
 
}

///////////////////Converting a word into an Array and Reversed///////////////////
public class Main {
 
 public static void main(String args[]){
 
 //String which we want to convert to String array
 String str = "Wayline";
 

 char[] ch = new char[str.length()];

 
 System.out.println("Word converted to String array");
 

 
 //Copying character by character into array
 for(int i=0; i < str.length(); i++){
	ch[i] = str.charAt(i);

 }
 
 //Printing out the Array
  for (char c : ch) {
            System.out.println(c);
  }
  
 //variable that I am going to use to store the reversed Word
 String reversed = "";
 
 //Reverse elements of String array
 for(int i=str.length() -1 ; i>=0; i--){
 
 reversed = reversed + ch[i] + " ";
 }
 System.out.println(reversed);
 }
 

}

///////////////////Converting a word into an Array and Reversed///////////////////
///////////////////Checking for palindrone///////////////////
public class Main {
 
 public static void main(String args[]){
 
 //String which we want to convert to String array
 String str = "racecar";
 

 char[] ch = new char[str.length()];

 
 System.out.println("Word converted to String array");
 

 
 //Copying character by character into array
 for(int i=0; i < str.length(); i++){
	ch[i] = str.charAt(i);

 }
 
 //Printing out the Array
  for (char c : ch) {
            System.out.println(c);
  }
  
 //variable that I am going to use to store the reversed Word
 String reversed = "";
 
 //Reverse elements of String array
 for(int i=str.length() -1 ; i>=0; i--){
 
 reversed = reversed + ch[i];
 }
 
 System.out.println("Original word: " + str);
 System.out.println("Reversed word: " + reversed);
 
 //Comparing the two strings to check for palindrone
 if (str.compareTo(reversed) == 0){
  System.out.println("The word you entered is a palindrone");
 }
 else{
 System.out.println("The word you entered is not a palindrone");
 }
 
 }

}
