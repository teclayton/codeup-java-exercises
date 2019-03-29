public class ServerNameGenerator {
    public static void main(String[] args) {

       String randAdj = randElement(adjective);
       String randNoun = randElement(noun);

       System.out.printf("Here is your server name: %n"
               + randAdj + "-" + randNoun);

    }

   public static String[] adjective = {"wet", "slimy", "fat", "short", "big",
            "fast", "spooky", "rude", "crotchety", "elderly"};

   public static String[] noun = {"monster", "butt", "mustang", "italy", "pikachu",
            "elevator", "shotgun", "flower", "puddle", "zombie"};

   public static String randElement(String[] arr){
        int rand = (int) (Math.round(Math.random() * arr.length));
        return arr[rand];
   }
}

