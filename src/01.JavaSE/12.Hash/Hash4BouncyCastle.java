public class Hash4BouncyCastle {
  public static void main(String[] args) {
       // 注册BouncyCastle:
       Security.addProvider(new BouncyCastleProvider());
       // 按名称正常调用:
       MessageDigest md = MessageDigest.getInstance("RipeMD160");
       md.update("HelloWorld".getBytes("UTF-8"));
       byte[] result = md.digest();
       System.out.println(new BigInteger(1, result).toString(16));
  }
}
