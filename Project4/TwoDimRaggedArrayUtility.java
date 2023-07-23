import java.io.*;
import java.util.*;
import java.lang.*;

public class TwoDimRaggedArrayUtility
{
     public static double[][] readFile(File file)
     {
          double[][] data = new double[6][];
          String line;
          int i = 0;
          try

          {
              BufferedReader br = new BufferedReader(new FileReader(file));
              while ((line = br.readLine()) != null)
              {
                   String[] temp = line.split(" ");
                   int size = temp.length;
                   data[i] = new double[size];
                   
                   for (int k = 0; k < size; k++)
                   {
                        data[i][k] = Double.parseDouble(temp[k]);
                   }
                   i++;
              }
              br.close();
          }
          catch (Exception ep)
          {
              ep.printStackTrace();
          }
          return data;
     }
     public static void writeToFile(double[][] data, File file)
     {
          try
          {
              BufferedWriter br = new BufferedWriter(new FileWriter(file));
              for (int i = 0; i < data.length; i++)
              {
                   for (int k = 0; k < data[i].length; k++)
                   {
                        br.write(data[i][k] + " ");
                   }
                   br.newLine();
              }
              br.close();
          }
          catch (Exception ep)
          {
              ep.printStackTrace();
          }
     }
     public static double getTotal(double[][] data)
     {
          double total = 0;
          for (int i = 0; i < data.length; i++)
          {
              for (int k = 0; k < data[i].length; k++)
              {
                   total += data[i][k];
              }
          }
          return total;
     }
     public static double getAverage(double[][] data)
     {
          double total = 0;
          int numOf = 0;
          for (int i = 0; i < data.length; i++)
          {
              for (int k = 0; k < data[i].length; k++)
              {
                   total += data[i][k];
                   numOf += 1;
              }
          }
          return new Double(total / numOf);
     }
     public static double getRowTotal(double[][] data, int row)
     {
          double total = 0;
          for (int k = 0; k <data[row].length; k++)
          {
              total += data[row][k];
          }
          return total;
     }
     public static double getColumnTotal(double[][] data, int col)
     {
          double total = 0;
          for (int i = 0; i < data.length; i++)
          {
              if (col <= data[i].length - 1)
              {
            	  total += data[i][col];
              }   
          }
          return total;
     }
     public static double getHighestInRow(double[][] data, int row)
     {
          double highest = data[row][0];
          for (int k = 0; k < data[row].length; k++)
          {
              if (data[row][k] > highest)
              {
            	  highest = data[row][k]; 
              }    
          }
          return highest;
     }
     public static int getHighestInRowIndex(double[][] data, int row)
     {
          int index = 0;
          for (int i = 0; i < data[row].length; ++i)
          {
              if (data[row][i] > data[row][index])
              {
                   index = i;
              }
          }
          return index;
     }
     public static double getLowestInRow(double[][] data, int row)
     {
          double lowest = data[row][0];
          for (int i = 0; i < data[row].length; i++)
          {
              if (data[row][i] < lowest) 
              {
            	  lowest = data[row][i]; 
              }                   
          }
          return lowest;
     }
     public static int getLowestInRowIndex(double[][] data, int row)
     {
          int index = 0;
          for (int i = 0; i < data[row].length; ++i)
          {
              if (data[row][i] < data[row][index])
              {
                   index = i;
              }
          }
          return index;
     }
     public static double getHighestInColumn(double[][] data, int col)
     {
          double highest = data[0][col];
          for (int i = 0; i < data.length; i++)
          {
              if (col <= data[i].length - 1)
              {
                   if (data[i][col] > highest)
                   {
                	   highest = data[i][col]; 
                   }                       
              }
          }
          return highest;
     }
     public static int getHighestInColumnIndex(double[][] data, int col)
     {
          int highest = 0;
          for (int i = 0; i < data.length; i++)
          {
              if (data[i].length > col)
              {
                   if (data[i][col] > data[highest][col])
                   {
                	   highest = i; 
                   }                     
              }
          }
          return highest;
     }
     public static double getLowestInColumn(double[][] data, int col)
     {
          double lowest = data[0][col];
          for (int i = 0; i < data.length; i++)
          {
              if (col <= data[i].length - 1)
              {
            	  if (data[i][col] < lowest)
            	  {
            		  lowest = data[i][col];
            	  }
              }                                         
          }
          return lowest;
     }
     public static int getLowestInColumnIndex(double[][] data, int col)
     {
          int highest = 0;
          for (int i = 0; i < data.length; i++)
          {
              if (data[i].length > col)
              {
                   if (data[i][col] < data[highest][col])
                   {
                	   highest = i;
                   }                        
              }
          }
          return highest;
     }
     public static double getHighestInArray(double[][] data)
     {
          double highest = data[0][0];
          for (int i = 0; i < data.length; i++)
          {
              for (int j = 0; j < data[i].length; j++)
              {
                   if (data[i][j] > highest)
                   {
                	   highest = data[i][j]; 
                   }                      
              }
          }
          return highest;
     }
     public static double getLowestInArray(double[][] data)
     {
          double lowest = data[0][0];
          for (int i = 0; i < data.length; i++)
          {
              for (int j = 0; j < data[i].length; j++)
              {
                   if (data[i][j] < lowest)
                   {
                	   lowest = data[i][j];
                   }                       
              }
          }
          return lowest;
     }
}