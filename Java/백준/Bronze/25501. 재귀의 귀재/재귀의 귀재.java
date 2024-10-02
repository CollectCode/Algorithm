import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.IOException;

import java.io.InputStreamReader;

import java.io.OutputStreamWriter;

import java.util.StringTokenizer;

public class Main   {

    private static int count = 0;

    private static int process(String str, int st, int fi, int cnt)    {

        if(st>=fi)  

        {

            count = cnt;

            return 1;

        }

        else if(str.charAt(st) != str.charAt(fi))

        {

            count = cnt;

            return 0;

        }

        else {

           return process(str, st+1, fi-1, cnt+1); 

        }

    }

    public static void main(String args[]) throws IOException   {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        for(int i=0;i<num;i++)  {

            count = 0;

            String str = br.readLine();

            bw.write(process(str, 0, str.length()-1, 1) + " " + count + "\n");

        }

        bw.flush();

        bw.close();

    }

}