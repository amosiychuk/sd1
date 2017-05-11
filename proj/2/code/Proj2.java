//Proj 2
//Alexander Mosiychuk
//Cmpt 220

import java.util.Scanner;
import java.util.ArrayList;

public class Proj2 {
  public static void main(String[] args) {
    
    int length;
    int counter;
    
    //Verify that input for length is a nonnegative integer
    while(true) {
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter the desired amount of keywords: ");
    
      if(input.hasNextInt()){
        length = Math.abs(input.nextInt());
        break;
      }
      else{
        System.out.println("Invalid input!");
      } 
    }
    
    //so a length of zero is not used
    if(length == 0)
      length++;
    
    //Declare array to store keywords
    String[] keyword =  new String[length];

    //loop for input
    Scanner input = new Scanner(System.in);
    for(int i=0 ; i < keyword.length ; i++){
      System.out.println("Please enter keyword " + (i + 1) + " : ");
      String inp = input.next();
      keyword[i] = inp.toLowerCase();
    }
    
    sort(keyword);
    
    //Url for Crawler
    System.out.print("Enter a URL: ");
    String url = input.next();
    
    counter = crawler(url, keyword);
    
    if(counter >= 50){
      System.out.print("Significant amount of matches. High risk");
    }
    else if(counter >= 10 && counter < 50){
      System.out.print("Moderate amount of matches. potential risk");
    }
    else{
      System.out.print("Minimal matches. minimal risk");
    }
    
  }
  
  //Method to sort the keyword array, allowing for binary searches
  public static void sort(String[] list) {
 
    for(int i = 0; i < list.length - 1; i++){
      //element of array to be compared
      
      int comparisonIndex = i;
      
      //loop to compare the elements of the string array
      
      for(int j=i + 1; j < list.length; j++){  
      
      if( list[j].compareTo(list[comparisonIndex]) < 0){
          comparisonIndex = j;
        }
      }
      
      //swap the elements if needed
      if(comparisonIndex != i){
        String temp = list[i];
        list[i] = list[comparisonIndex]; 
        list[comparisonIndex] = temp;
      }
    }
  } 
  
  //Method to scan webpage for keywords, using binary search
  public static int read(String inpUrl, String[] key){
    try {
      java.net.URL url = new java.net.URL(inpUrl);
      Scanner input = new Scanner(url.openStream());
      int count = 0;
      int index;
      while(input.hasNext()){
        String temp = input.next();
        temp.toLowerCase();
        //Compare webpage data with keywords
        index = java.util.Arrays.binarySearch(key, temp);
        //binarySearch returns negative values when no match is found
        if(index >= 0)
          count++;
      }
      return count;
    }
    catch(java.net.MalformedURLException ex){
      System.out.print("Invalid URL!");
      return 0;
    }
    catch(java.io.IOException ex){
      System.out.print("Invalid URL!");
      return 0;
    }
  }
  
  //Methods for crawler
  public static int crawler(String startingURL, String[] key) {
    ArrayList<String> listOfPendingURLs = new ArrayList<>();
    ArrayList<String> listOfTraversedURLs = new ArrayList<>();
    int counter = 0;
    
    listOfPendingURLs.add(startingURL);
    while (!listOfPendingURLs.isEmpty() && 
        listOfTraversedURLs.size() <= 3) {
      String urlString = listOfPendingURLs.remove(0);
      listOfTraversedURLs.add(urlString);
      System.out.println("Crawl " + urlString);
      
      counter += read(urlString, key);

      for (String s: getSubURLs(urlString)) {
        if (!listOfTraversedURLs.contains(s) && 
        		!listOfPendingURLs.contains(s))
          listOfPendingURLs.add(s);
      }
    }
    return counter;
  }
  
  public static ArrayList<String> getSubURLs(String urlString) {
    ArrayList<String> list = new ArrayList<>();
    
    try {
      java.net.URL url = new java.net.URL(urlString); 
      Scanner input = new Scanner(url.openStream());
      int current = 0;
      while (input.hasNext()) {
        String line = input.nextLine();
        current = line.indexOf("http:", current);
        while (current > 0) {
          int endIndex = line.indexOf("\"", current);
          if (endIndex > 0) { // Ensure that a correct URL is found
            list.add(line.substring(current, endIndex)); 
            current = line.indexOf("http:", endIndex);
          }
          else 
            current = -1;
        }
      } 
    }
    catch (Exception ex) {
      System.out.println("Error: " + ex.getMessage());
    }
    
    return list;
  }
  
  
  
}