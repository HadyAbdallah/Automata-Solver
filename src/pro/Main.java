package pro;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.io.FileWriter;
import java.io.IOException;



public class Main {
	public static String P1(String input) {
		int Q0 = 0; 
        int Q1 = 1; 
        int Q2 = 2;
		int[][] transitontTable = {
		        {Q0, Q1},
		        {Q2, Q1},
		        {Q2, Q2}
		    };
		int intialState = Q0;
		boolean[] isAccepting = {true, true, false};
		int currentState = intialState;
		for (char symbol : input.toCharArray()) {
			int symbolIndex;
			if(symbol=='a') 
				symbolIndex =0;
			else if(symbol=='b')
				symbolIndex =1;
			else
				return "False";
            currentState = transitontTable[currentState][symbolIndex];
        }
		if(isAccepting[currentState])
			return "True";
		else
			return "False";
	}
	
	 public static String P2(String input) {
	        int Q0 = 0;
	        int Q1 = 1;
	        int Q2 = 2;
	        int Q3 = 3;
	        int Q4 = 4;
	        int[][] transitontTable = {
	                {Q1, Q3},
	                {Q2, Q4},
	                {Q1, Q3},
	                {Q4, Q4},
	                {Q4, Q4}
	        };
	        int intialState = Q0;
	        boolean[] isAccepting = {false, false, false,true,false};
	        int currentState = intialState;
	        for (int i=0;i<input.length();i++) {
	            int symbolIndex;
	            if(input.charAt(i)=='0')
	            {
	                symbolIndex = 0;
	            }
	            else if(input.charAt(i)=='1')
	                symbolIndex =1;
	            else
	                return "False";
	            currentState = transitontTable[currentState][symbolIndex];
	        }
	        if(isAccepting[currentState])
	            return "True";
	        else
	            return "False";
	    }
	 
	    public static String P3(String input) {
	        int Q0 = 0;
	        int Q1 = 1;
	 
	        int[][] transitontTable = {
	                {Q1, Q0},
	                {Q0, Q1},
	        };
	        int intialState = Q0;
	        boolean[] isAccepting = {false, true};
	        int currentState = intialState;
	        for (int i=0;i<input.length();i++) {
	            int symbolIndex;
	            if(input.charAt(i)=='x')
	            {
	                symbolIndex = 0;
	            }
	            else if(input.charAt(i)=='y')
	                symbolIndex =1;
	            else
	                return "False";
	            currentState = transitontTable[currentState][symbolIndex];
	        }
	        if(isAccepting[currentState])
	            return "True";
	        else
	            return "False";
	    }
	 
	    public static String P4(String input) {
	        int Q0 = 0;
	        int Q1 = 1;
	        int Q2 = 2;
	        int Q3 = 3;
	        int Q4 = 4;
	        int[][] transitontTable = {
	                {Q1, Q2},
	                {Q1, Q3},
	                {Q4, Q2},
	                {Q1, Q3},
	                {Q4, Q2}
	        };
	        int intialState = Q0;
	        boolean[] isAccepting = {false, true, true, false, false};
	        int currentState = intialState;
	        for (char symbol : input.toCharArray()) {
	            int symbolIndex;
	            if(symbol=='a')
	                symbolIndex =0;
	            else if(symbol=='b')
	                symbolIndex =1;
	            else
	                return "False";
	            currentState = transitontTable[currentState][symbolIndex];
	        }
	        if(isAccepting[currentState])
	            return "True";
	        else
	            return "False";
	    }
	    public static String P5(String input) {
	        int Q0 = 0;
	        int Q1 = 1;
	        int Q2 = 2;
	        int Q3 = 3;
	        int[][] transitontTable = {
	                {Q0, Q1},
	                {Q2, Q3},
	                {Q0, Q1},
	                {Q2, Q3}
	        };
	        int intialState = Q0;
	        boolean[] isAccepting = {true, false, false,false};
	        int currentState = intialState;
	        for (char symbol : input.toCharArray()) {
	            int symbolIndex;
	            if(symbol=='0')
	                symbolIndex =0;
	            else if(symbol=='1')
	                symbolIndex =1;
	            else
	                return "False";
	            currentState = transitontTable[currentState][symbolIndex];
	        }
	        if(isAccepting[currentState])
	            return "True";
	        else
	            return "False";
	    }
	
	public static String P6(String input) {
		int Q0 = 0; 
        int Q1 = 1; 
        int Q2 = 2;
        int Q3 = 3; 
        int Q4 = 4; 
		int[][] transitontTable = {
		        {Q4, Q1},
		        {Q4, Q2},
		        {Q4, Q3},
		        {Q4, Q4},
		        {Q4, Q4}
		    };
		int intialState = Q0;
		boolean[] isAccepting = {false, true, false, false, true};
		int currentState = intialState;
		for (char symbol : input.toCharArray()) {
			int symbolIndex;
			if(symbol=='0') 
				symbolIndex =0;
			else if(symbol=='1')
				symbolIndex =1;
			else
				return "False";
            currentState = transitontTable[currentState][symbolIndex];
        }
		if(isAccepting[currentState])
			return "True";
		else
			return "False";
	}
	
	public static String P7(String input) {
        int Q0 = 0;
        int Q1 = 1;
        int Q2 = 2;
        int Q3 = 3;
        int Q4 = 4;
        int Q5 = 5;
        int Q6 = 6;
        int[][][] transitontTable = {
                {{Q1}, {Q2}},
                {{Q1,Q4}, {Q3}},
                {{Q4}, {Q2,Q3}},
                {{Q5}, {Q3}},
                {{Q4}, {Q6}},
                {{Q5}, {Q3}},
                {{Q4}, {Q6}}
        };
        int intialState = Q0;
        boolean[] isAccepting = {true, true, true,false,false, true,true};
        Set<Integer> currentStates = new HashSet<>();
        currentStates.add(intialState);
        for (char symbol : input.toCharArray()) {
            int symbolIndex;
            Set<Integer> nextStates = new HashSet<>();
            for (int state : currentStates)
            {
                if(symbol=='0')
                    symbolIndex =0;
                else if(symbol=='1')
                    symbolIndex =1;
                else
                    return "False";
                for (int nextState : transitontTable[state][symbolIndex]) {
                    nextStates.add(nextState);
                }
            }
            currentStates = nextStates;
        }
        boolean flag=false;
        for (int state : currentStates) {
            if(isAccepting[state]) {
                flag=true;
                break;
            }
        }
        if(flag)
            return "True";
        else
            return "False";
    }
	
	public static String P8(String input) {
		int Q0 = 0; 
        int Q1 = 1; 
        int Q2 = 2;
        int Q3 = 3; 
        int Q4 = 4; 
        int Q5 = 5;
        int Q6 = 6;
		int[][][] transitontTable = {
		        {{Q0,Q4}, {Q0,Q1}},
		        {{Q2}, {}},
		        {{}, {Q3}},
		        {{Q3}, {Q3}},
		        {{}, {Q5}},
		        {{Q6}, {}},
		        {{Q6}, {Q6}}
		    };
		int intialState = Q0;
		boolean[] isAccepting = {false, false, false,true,false, false,true};
		Set<Integer> currentStates = new HashSet<>();
		currentStates.add(intialState);
		for (char symbol : input.toCharArray()) {
			int symbolIndex;
			Set<Integer> nextStates = new HashSet<>();
			 for (int state : currentStates)
			 {
				 if(symbol=='0') 
						symbolIndex =0;
					else if(symbol=='1')
						symbolIndex =1;
					else
						return "False";
				 for (int nextState : transitontTable[state][symbolIndex]) {
	                    nextStates.add(nextState);
	                } 
			 }
			 currentStates = nextStates;
        }
		boolean flag=false;
		for (int state : currentStates) {
			if(isAccepting[state]) {
				flag=true;
				break;
			}
		}	
		if(flag)
			return "True";
		else
			return "False";
	}
	
	public static String P9(String input) {
		int Q0 = 0; 
        int Q1 = 1; 
        int Q2 = 2;
		int[][] transitontTable = {
		        {Q1, Q2},
		        {-1, Q2},
		        {Q1, -1}
		    };
		int intialState = Q0;
		boolean[] isAccepting = {false, true, true};
		int currentState = intialState;
		for (char symbol : input.toCharArray()) {
			int symbolIndex;
			if(symbol=='0') 
				symbolIndex =0;
			else if(symbol=='1')
				symbolIndex =1;
			else
				return "False";
            currentState = transitontTable[currentState][symbolIndex];
            if(currentState==-1)
            	return "False";
        }
		if(isAccepting[currentState])
			return "True";
		else
			return "False";
	}
	
	public static String P10(String input) {
        int Q0 = 0;
        int Q1 = 1;
        int Q2 = 2;
        int Q3 = 3;
        int[][] transitontTable = {
                {Q1, Q2},
                {-1, Q2},
                {Q1, Q2}
        };
        int intialState = Q0;
        boolean[] isAccepting = {false, false,true};
        int currentState = intialState;
        for (char symbol : input.toCharArray()) {
            int symbolIndex;
            if(symbol=='0')
                symbolIndex =0;
            else if(symbol=='1')
                symbolIndex =1;
            else
                return "False";
            currentState = transitontTable[currentState][symbolIndex];
            if(currentState==-1)
            {
                return "False";
            }
        }
        if(isAccepting[currentState])
            return "True";
        else
            return "False";
    }
	
	public static void main(String[] args) {
		String readfile;
		File file = new File("input.txt");
        try {
			Scanner myReader= new Scanner(file);
			FileWriter myWriter = new FileWriter("output.txt");
			while (myReader.hasNextLine()) {
				readfile=myReader.nextLine();
				if(readfile.equals("1")) {
				    myWriter.write(readfile+"\n");
					readfile=myReader.nextLine();
					while(!readfile.equals("end")) {
						myWriter.write(P1(readfile)+"\n");
						readfile=myReader.nextLine();
					}
					myWriter.write("x\n");
				}
				else if(readfile.equals("2")) {
					myWriter.write(readfile+"\n");
					readfile=myReader.nextLine();
					while(!readfile.equals("end")) {
						myWriter.write(P2(readfile)+"\n");
						readfile=myReader.nextLine();
					}
					myWriter.write("x\n");
				}
				else if(readfile.equals("3")) {
					myWriter.write(readfile+"\n");
					readfile=myReader.nextLine();
					while(!readfile.equals("end")) {
						myWriter.write(P3(readfile)+"\n");
						readfile=myReader.nextLine();
					}
					myWriter.write("x\n");		
				}
				else if(readfile.equals("4")) {
					myWriter.write(readfile+"\n");
					readfile=myReader.nextLine();
					while(!readfile.equals("end")) {
						myWriter.write(P4(readfile)+"\n");
						readfile=myReader.nextLine();
					}
					myWriter.write("x\n");
				}
				else if(readfile.equals("5")) {
					myWriter.write(readfile+"\n");
					readfile=myReader.nextLine();
					while(!readfile.equals("end")) {
						myWriter.write(P5(readfile)+"\n");
						readfile=myReader.nextLine();
					}
					myWriter.write("x\n");
				}
				else if(readfile.equals("6")) {
					myWriter.write(readfile+"\n");
					readfile=myReader.nextLine();
					while(!readfile.equals("end")) {
						myWriter.write(P6(readfile)+"\n");
						readfile=myReader.nextLine();
					}
					myWriter.write("x\n");
				}
				else if(readfile.equals("7")) {
					myWriter.write(readfile+"\n");
					readfile=myReader.nextLine();
					while(!readfile.equals("end")) {
						myWriter.write(P7(readfile)+"\n");
						readfile=myReader.nextLine();
					}
					myWriter.write("x\n");
				}
				else if(readfile.equals("8")) {
					myWriter.write(readfile+"\n");
					readfile=myReader.nextLine();
					while(!readfile.equals("end")) {
						myWriter.write(P8(readfile)+"\n");
						readfile=myReader.nextLine();
					}
					myWriter.write("x\n");
				}
				else if(readfile.equals("9")) {
					myWriter.write(readfile+"\n");
					readfile=myReader.nextLine();
					while(!readfile.equals("end")) {
						myWriter.write(P9(readfile)+"\n");
				        readfile=myReader.nextLine();
				    }
					myWriter.write("x\n");
				}
				else if(readfile.equals("10")) {
					myWriter.write(readfile+"\n");
					readfile=myReader.nextLine();
					while(!readfile.equals("End")) {
						myWriter.write(P10(readfile)+"\n");
						readfile=myReader.nextLine();
					}
					myWriter.write("x\n");
				}
				else if(readfile.equals("end"))
				{
					break;
				}
					
				
	          }
			myWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}