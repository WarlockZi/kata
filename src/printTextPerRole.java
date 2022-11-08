public class printTextPerRole {
    public static void main(String[] args) {

        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",};
        String[] roles = new String[]{
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич",
                "Демис Карибидис",
                "Лука"};
        System.out.println(printTextPerRole(roles, textLines));
//        System.out.println(printTextPerRole(
//                new String[] { "A", "AA", "AAA"},
//                new String[] {"AAA: 1A","AA: 2AA","A: 3AAA"}));
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
    StringBuilder sb = new StringBuilder();
    for (int j = 0; j < roles.length; j++) {
        String role = roles[j].concat(":").concat("\n");
        String name = roles[j].concat(":");
        sb.append(role);
        for (int i = 0; i < textLines.length; i++) {
            if (textLines[i].startsWith(name)) {
                String text = textLines[i].replace(name, "");
                sb.append(String.valueOf(i + 1)).append(")").append(text).append("\n");
            }
        }
        sb.append("\n");
    }
    return sb.toString();
    }
}
