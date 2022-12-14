package module;

public class Codificator {
    public Codificator() {
        //nessuno stato
    }

    public String encode(String binaryString){
        char[] inputInChars = binaryString.toCharArray();
        byte[] inputInBytes = new byte[binaryString.length()];

        byte[] outputInBytes = new byte[binaryString.length()];
        char[] outputInChars = new char[binaryString.length()];

        String encodedString;

        int i = 0;

        for (char chare : inputInChars ) {
            if(chare == '0') {
                inputInBytes[i] = 0;
            }
            else {
                inputInBytes[i] = 1;
            }
            i++;
        }

        for (i=0;i<inputInBytes.length;i++) {
            if(i==0){
                outputInBytes[i] = (byte) (inputInBytes[i] ^ inputInBytes[i+1]);
            }
            else if(i==inputInBytes.length-1){
                outputInBytes[i] = (byte) (inputInBytes[i-1] ^ inputInBytes[i]);
            }
            else{
                outputInBytes[i] = (byte) (inputInBytes[i-1] ^ inputInBytes[i] ^ inputInBytes[i+1]);
            }
        }

        i=0;
        for (byte e : outputInBytes) {
            if(e==0){
                outputInChars[i]='0';
            }
            else{
                outputInChars[i]='1';
            }
            i++;
        }

        encodedString = String.copyValueOf(outputInChars);
        return encodedString;
    }
}
