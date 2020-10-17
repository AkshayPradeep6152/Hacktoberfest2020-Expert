import java.util.*;
class Invert
{
public static void main(String rags[])
{
    String x="",x1="";
    int s=0,p=0,h=0,w=0,m=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Any Sentence");
    String n=sc.nextLine().trim();
    n=n+" ";
    x1=n;
    int b[]=new int[1000];
    String a[]=new String[1000];
    String c[]=new String[1000];
    int l=x1.length();
    char ch1=x1.charAt(l-1);
    if(n.charAt(l-2)!='.')
    { 
        System.out.print("INVALID");
    }
    else
    {
        System.out.println(n);              /// for printing original Sentence
        n=n.substring(0,n.length()-2)+" ";
    for(int i=0;i<l-1;i++)
    {
        char ch=n.charAt(i);
        if(ch!=' ')
        {
            x=x+ch;
        }
        else
        {
            int q=x.length();     
            b[s]=q;         // for storing length of each word in array              
            s++;
            
            a[p]=x;                  // for storing each word in array
            p++;
            x="";  
        }
    }

      // sorting of the sentence}

    for(int i=0;i<s;i++)
    {
        for(int j=0;j<s-i-1;j++)
        {
            if(b[j]>b[j+1])
            {
                int temp=b[j];
                b[j]=b[j+1];
                b[j+1]=temp;
                
                String temp1=a[j];
                a[j]=a[j+1];
                a[j+1]=temp1;
            }
        }
    }   
      for(int i=0;i<s;i++)
       {
        m=b[i]; 
        int r1=0;
        if(b[i]!=b[i+1])             
        {
            System.out.print(a[i]+" ");       //for print sentence whose length is                                                                                                                                     not equal.
        }
        else
        {
             for(int j=i;j<s;j++)
            {
                c[r1]=a[j];
                r1++;
            }
            for(int k=0;k<r1;k++)
            {
                for(int j=0;j<r1-k-1;j++)
                {
                    if(c[j].compareTo(c[j+1])>0)    // sorting the word                                                                                                                           whose length is same
                    {
                        String temp=c[j];
                        c[j]=c[j+1];
                        c[j+1]=temp;
                    }
                }
            }
            for(int j=0;j<r1;j++)
            {
                System.out.print(c[j]+" ");
            }
            i=i+r1-1;
        }
    }
}
}
}
