import java.io.*;

import java.util.*;

class Main{

    public static void main (String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,k;
        String line = br.readLine();
        //trim will remove the spaces
        String[] strs = line.trim().split("\\s+");
        n=Integer.parseInt(strs[0]);
        k=Integer.parseInt(strs[1]);
        Long sum=0L;
        Queue<Integer>x=new LinkedList<Integer>();
        while(n>0){
            n--;
            line = br.readLine();
            strs = line.trim().split("\\s+");
            int y=Integer.parseInt(strs[0]);
            if(y==1){
                y=Integer.parseInt(strs[1]);
                x.add(y);
                sum += y;
                if (x.size() > k) {
                    sum -= x.peek();
                    x.remove();
                }
            }
            else{
                System.out.print(sum+"\n");

            }

        }

    }

}
