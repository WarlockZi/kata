public class CreditForClient {
    public static void main(String[] args) throws BadCreditHistoryException, ProblemWithLawException {
        BankClient bc = new BankClient(true, false);
        BankWorker bw = new BankWorker();
        System.out.println(getCreditForClient(bw, bc));
    }

    public static boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
        try {
            return bankWorker.checkClientForCredit(bankClient);
        } catch (BadCreditHistoryException bc) {
            System.out.println("Проблемы с банковской историей");
        } catch (ProblemWithLawException ignored) {
        }
        return false;
    }

}

class BankClient {
    public boolean badHistory = true;
    public boolean badLaw = true;

    public BankClient(boolean badHistory, boolean badLaw) {
        this.badHistory = badHistory;
        this.badLaw = badLaw;
    }
}

class BankWorker implements IBankWorker {
    protected static BankClient bc;

    @Override
    public boolean checkClientForCredit(BankClient bc) throws ProblemWithLawException, BadCreditHistoryException {
        if (bc.badHistory) {
            throw new BadCreditHistoryException();
        } else if (bc.badLaw) {
            throw new ProblemWithLawException();
        }
        return true;
    }
}

class BadCreditHistoryException extends Exception {

}

class ProblemWithLawException extends Exception {

}

interface IBankWorker {
    public boolean checkClientForCredit(BankClient bc) throws ProblemWithLawException, BadCreditHistoryException;
}

