import java.util.*;
public class main
{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello!I am Mohan Rore.Please Enter You Name:");
        String mn=sc.nextLine();
        System.out.println("Hello "+mn);
        System.out.println("1-order of alphabet   ****For example: input= Computer Output=Cemoprtu****\n");
        System.out.println("2-Frequency of a word   ****For example: Input= He sat where Ram sat (and word to be counted is sat) Output=2)****\n");
        System.out.println("3-To determine number of lower case,upper case,special characters and digits\n");
        System.out.println("4-To input name, middle name and surname of a person and print only the initials\n");
        System.out.println("5-To determine number of vowels in upper case,in lowercase,blank spaces,words and consonance\n");
        System.out.println("6-To determine a word is palindrome or not   ****For example: Input=mom Output=The word is Palindrome****\n");
        System.out.println("7-To determine the number of same consequetive words occuring in pairs\n");
        System.out.println("8-To swap the case of each character of a string   ****For example: Input=Apple Output=aPPLE****\n");
        System.out.println("9-To swap ever vowel with the alphabetical orderly next alphabet ****For example: Input=apple Output=bpplf****\n");
        System.out.print("10-To input name,middle name,last name of a person and print initials of name and middle name and print complete surname  ");
        System.out.println("****For example: Input=Integra Fairbrooks Helsing Output=I.F. Helsing****\n");
        int zxcv=sc.nextInt();
        switch(zxcv)
        {
            case 1:
            {System.out.println("Enter a String ");
                String s=sc.next();
                int p=s.length();
                char ch;
                for (int i=65;i<=90;i++)
                {
                    for(int j=0;j<p;j++)
                    {
                        ch=s.charAt(j);
                        if(ch==(char)i||ch==(char)i+32)
                        {
                            System.out.print(ch);
                        }
                    }
                }
                break;
            }
            case 2:
            {System.out.println("enter main string");
                String s= sc.nextLine();
                System.out.println("enter string to be searched");
                String f= sc.next();
                s=s+" ";
                int l=s.length();
                char a; int c=0;
                String s1="";
                for(int i=0;i<l;i++)
                { a=s.charAt(i);
                    if(a!=' ')
                        s1=s1+a;
                    else
                    { if(s1.equalsIgnoreCase(f)==true)
                            c++;
                        s1="";
                    }
                }
                System.out.println("Frequency of the word "+ f +  " is "+c);
                break;}
            case 3:
            {
                int a,p,uc=0,lc=0,d=0,sp=0;char chr;
                System.out.println("Enter a String ");
                String s=sc.nextLine();
                p=s.length();
                for (a=0;a<p;a++)
                {
                    chr=s.charAt(a);
                    if (chr>='A'&&chr<='Z')
                    {
                        uc++;
                    }
                    else if(chr>='a'&&chr<='z')
                    {
                        lc++;
                    }
                    else if(chr>='0'&&chr<='9')
                    {
                        d++;
                    }
                    else
                    {
                        sp++;
                    }
                }
                System.out.println("The number of Uppercase characters are====="+uc);
                System.out.println("The number of Lowercase characters are====="+lc);
                System.out.println("The number of Special characters are====="+sp);
                System.out.println("The number of Digits are====="+d);
                break;
            }
            case 4:
            {
                System.out.println("Enter your name");
                String s=sc.nextLine();
                int len=s.length();
                char a;String s1=" ",s2=" ";
                System.out.print("Initials are   "+s.charAt(0) );
                for (int i=0;i<len;i++)
                {
                    a=s.charAt(i);
                    if(a==' ' )
                        System.out.print("."+s.charAt(i+1));
                }
                break;
            }
            case 5:
            {
                System.out.println("Enter a String");
                String s=sc.nextLine();
                int n=s.length();char ch;int vs=0,vb=0,b=0,c=0;
                for(int i=0;i<n;i++)
                {
                    ch=s.charAt(i);
                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    {
                        vs++;
                    }

                    if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
                    {
                        vb++;
                    }
                    if(ch==' ')
                    {
                        b++;
                    }
                    if((int)ch>=65&&(int)ch<=90&&(int)ch!=65&&(int)ch!=69&&(int)ch!=73&&(int)ch!=79&&(int)ch!=85)          
                    {
                        c++;
                    }
                    if((int)ch>=97&&(int)ch<=122&&(int)ch!=97&&(int)ch!=101&&(int)ch!=105&&(int)ch!=111&&(int)ch!=117)
                    {
                        c++;
                    }
                }
                System.out.println("The number of Vowels in lower case are "+vs);
                System.out.println("The number of Vowels in upper case are "+vb);
                System.out.println("The number of Blank spaces are  "+b);
                System.out.println("The number of Words are  "+(b+1));
                System.out.println("The number of consonance are "+c);
                break;}
            case 6:
            {
                System.out.println("Enter a string ");
                String s=sc.next();
                char ch;int h=0;
                int p=s.length();
                for(int i=0;i<p;i++)
                {
                    ch=s.charAt(i);
                    if(ch==(s.charAt(p-1-i)))
                    {
                        h++;
                    }
                }

                if(h==p)
                {
                    System.out.println(" The word is Palindrome");
                }
                else
                {
                    System.out.println("The word is not Palindrome");
                } break;
            }
            case 7:
            {
                System.out.println("Enter a string ");
                String s1=sc.nextLine();
                String s2=s1.toUpperCase();
                System.out.println(s2);
                int a=s1.length(),b=0;char ch1,ch2=' ';
                for(int i=0;i<a;i++)
                {
                    ch1=s1.charAt(i);
                    if(i<a-1)
                    { ch2=s1.charAt(i+1);}
                    if(ch1==ch2)
                    {
                        b++;
                    }
                }
                System.out.println("The number of consequtive  double alphabets is"+b);
                break;}
            case 8:
            {
                System.out.println("Enter a string");
                String s=sc.nextLine();
                int a=s.length();char ch=' ',ch1=' ';
                for(int i=0;i<a;i++)
                {
                    ch=s.charAt(i);
                    if(Character.isLowerCase(ch))
                    {
                        ch1=Character.toUpperCase(ch);
                        System.out.print(ch1);
                    }
                    else if(Character.isUpperCase(ch))
                    {
                        ch1=Character.toLowerCase(ch);
                        System.out.print(ch1);
                    }
                    else
                    {
                        System.out.print(ch);
                    }
                }
                break;  }

            case 9:
            {
                System.out.println("Enter a string :");
                String s=sc.nextLine();
                int l=s.length();String s1;
                for(int i=0;i<l;i++)
                {
                    char ch=s.charAt(i);
                    if(ch=='a')
                    {
                        System.out.print("b");
                    }
                    else if(ch=='e')
                    {
                        System.out.print("f");
                    }
                    else if(ch=='i')
                    {
                        System.out.print("j");
                    }
                    else if(ch=='o')
                    {
                        System.out.print("p");

                    }
                    else if(ch=='u')
                    {
                        System.out.print("v");
                    }
                    else  if(ch=='A')
                    {
                        System.out.print("B");
                    }
                    else if(ch=='E')
                    {
                        System.out.print("F");
                    }
                    else if(ch=='I')
                    {
                        System.out.print("J");
                    }
                    else if(ch=='O')
                    {
                        System.out.print("P");

                    }
                    else if(ch=='U')
                    {
                        System.out.print("V");
                    }
                    else
                    {
                        System.out.print(ch);
                    }
                }
                System.exit(0);
                break;
            }
            case 10:
            {
                System.out.println("Enter your name");
                String s=sc.nextLine();
                int len=s.length();
                char a;String s1=" ",s2=" ";
                System.out.print("Initials are   "+s.charAt(0)+"." );int n8=0,g=0;
                for (int i=0;i<len;i++)
                {
                    a=s.charAt(i);
                    if(a==' '&&n8==1)
                    {
                        i++; 
                        for(int j=i;j<len;j++)
                        {
                            System.out.print(s.charAt(j));
                        }
                        break;}
                    if(a==' ' )
                    {System.out.print(s.charAt(i+1)+" "); n8++;
                        ;}

                }
                break;   }
            default:
            {
                System.out.println("Error !!!!! Do you want to 1- enter your choice again   2-exit the program again? ");
                int mnbv=sc.nextInt();
                switch(mnbv)
                {
                    case 1:
                    {
                        System.out.print("");
                        break;
                    }
                    case 2:
                    {
                        System.exit(0);
                    }
                }
            }
        }
    }
}

        
    

