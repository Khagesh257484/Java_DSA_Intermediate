package com.dsa.advance.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeIntervals {
    static class Interval {
        int start, end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            this.start = s;
            this.end = e;
        }
    }


    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);

        if (intervals.size() == 0 || intervals.size() == 1)
            return intervals;

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        Interval first = intervals.get(0);
        int start = first.start;
        int end = first.end;

        ArrayList<Interval> result = new ArrayList<Interval>();

        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            if (current.start <= end) {
                end = Math.max(current.end, end);
            } else {
                result.add(new Interval(start, end));
                start = current.start;
                end = current.end;
            }
        }

        result.add(new Interval(start, end));
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Interval> x = new ArrayList<>();

        x.add(new Interval(1, 3));
        x.add(new Interval(2, 6));
        x.add(new Interval(8, 10));
        x.add(new Interval(15, 18));
        x.add(new Interval(17, 20));

        x = insert(x,new Interval(9,11));

        for(Interval i : x)
        {
            System.out.println(i.start + " " + i.end);
        }
    }
}
