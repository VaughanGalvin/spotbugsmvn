package ru.netology.spotbugsmvn;

public class FindMyBugService {
    public long findMax(long[] incomes) {
        long current_max_index = 0; // хз что это
        long current_max = incomes[0]; // перебор по массиву начнется с первой строки
        for (long income : incomes)
            if (current_max < income) {
                current_max = income;
            }
        return current_max;
    }
}
