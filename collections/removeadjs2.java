package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class removeadjs2 {
    public static void main(String[] args) {
        ArrayList<Integer>List=(ArrayList<Integer>)Arrays.asList(1,2,2,3,3,3,4,4,4,4,5,5,5,5);
        int start=0;
        while(start<List.size()-1)
            {
                if(List.get(start)==List.get(start+1)) 
                    {
                        List.remove(start+1);
                    }
                    else
                    {
                        start++;
                    }       
            }
        }
    }

//list of words -> 
//return->valid words
//valid-> word character count<=4;
//->. -> a-Z,A-Z

