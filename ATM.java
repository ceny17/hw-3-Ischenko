  class ATM {
    public int countBanknotes(int sum) {
        int result = 0;
        int i = 0;
        int[] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        while (sum >= 1) {
            result+= sum/banknotes[i];
            sum = sum%banknotes[i++];
        }
        return result;
    }
}
