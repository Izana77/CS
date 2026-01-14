package q;

import java.util.ArrayList;

public class Q4 {

public static ArrayList<Double> CToF(ArrayList<String> C) {
    if (C == null || C.isEmpty()) {
        return null;
    }

    for (String s : C) {
        if (s == null || s.isEmpty()) {
            return null;
        }
    }

    ArrayList<Double> answer = new ArrayList<>();

    try {
        for (String s : C) {
            double c = Double.parseDouble(s.trim());
            double f = (c * 9.0 / 5.0) + 32.0;
            answer.add(f);
        }
    } catch (NumberFormatException e) {
        return new ArrayList<>();
    }

    return answer;
}


}



