public class Chapter6_1 {
    public static void main(String[] args){
        String str = "HelloWorld";
        StringBuffer stringBuffer = new StringBuffer();
        char[] chars = str.toCharArray();

        for(int i=chars.length-1;i>=0;i--){
            if(Character.isUpperCase(chars[i])){
                chars[i] = Character.toLowerCase(chars[i]);
            }else{
                chars[i] = Character.toUpperCase(chars[i]);
            }
            stringBuffer.append(chars[i]);
        }
        System.out.println(stringBuffer.toString());
    }
}
