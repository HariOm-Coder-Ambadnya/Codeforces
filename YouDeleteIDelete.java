import java.util.Scanner;

public class YouDeleteIDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();



        while (n-- > 0) {



            String s = sc.next();
                String alicebest = null;


            for (int i = 0; i < s.length(); i++) {


                    if (s.charAt(i) != '0') 
                        continue;

                        StringBuilder asb = new StringBuilder(s);
                        asb.deleteCharAt(i);

                        String alicestr = asb.toString();

                        String bobbest = null;

                        for (int j = 0; j < alicestr.length(); j++) {

                        if(alicestr.charAt(j) != '1')
                            continue;

                            StringBuilder bsb = new StringBuilder(alicestr);
                            bsb.deleteCharAt(j);

                            String bobstring = bsb.toString();


                            if(bobbest == null || bobstring.compareTo(bobbest) < 0){
                                bobbest = bobstring;
                            }

                        
                    }

                        if(alicebest == null || bobbest.compareTo(alicebest) > 0){
                            alicebest = bobbest;
                        }


                    


                }

                        System.out.println(alicebest);

            }


        }



    }
