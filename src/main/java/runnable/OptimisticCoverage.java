package runnable;

import module.Codificator;

public class OptimisticCoverage {

    public static void main(String[] args){
        Codificator codificator = new Codificator();
        String s = codificator.encode("01010");
        System.out.println("\n"+s);
    }

}
