import java.util.*;
class Collections_Array{
    public static void main(String args[]){
        Collections_Array obj= new Collections_Array();
        obj.performance();
    }

    void performance(){
         Scanner sc=new Scanner(System.in);

        String name;
        System.out.println("Enter your name:\n");
        name=sc.nextLine();

        int NoOfMarks;
        System.out.println("Enter the no of subjects:\n");
        NoOfMarks=sc.nextInt();

        int[] Marks=new int[NoOfMarks];
        int[] RoundMarks=new int[NoOfMarks];

        System.out.println("Enter the marks:\n");

        for(int i=0;i<NoOfMarks;i++){
           Marks[i]=sc.nextInt();
        }

      


        for(int i=0;i<NoOfMarks;i++){
            RoundMarks[i]= Marks[i];
                while(RoundMarks[i]%5!=0){
                RoundMarks[i]++;

            }
        

        }

  System.out.println("Hey "+name+" your round marks for all the subjects are:\n");

        for(int i=0;i<NoOfMarks;i++){

             if(RoundMarks[i]<40){
                System.out.println("fail\n");
            }
            else{
                if((RoundMarks[i]-Marks[i])<3){
                    System.out.println(RoundMarks[i]+"\n");
                }
                else{
                    System.out.println(Marks[i]+"\n");
                }
            }
        }


    }

    
}