public class Main {
    public static void main (String[] args) {
        String[] wordListOne = {"милый", "красивый", "добрый", "милашный", "симпапульный", "котёночный", "загадочный", "злой"};
        String[] wordListTwo = {"гусевый", "любимый", "умный", "малюсенький", "котёнковый", "лошпедный"};
        String[] wordListThree = {"котек", "лошпедусек", "молыш", "молышочек", "гусёнок"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Коля, ты самый " + phrase);
    }
}
