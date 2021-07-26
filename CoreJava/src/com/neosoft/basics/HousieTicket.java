package com.neosoft.basics;

import java.util.*;
public class HousieTicket 
{
		int tickets[][];
		public HousieTicket() 
		{
			this.tickets = new int[3][9];
		}
		public static int RandomNumber(int min, int max) 
		{
			Random rand = new Random();
			return rand.nextInt(max - min + 1) + min;
		}
		public int Row(int r) {
			int c = 0;
			for (int i = 0; i < 9; i++) {
				if (tickets[r][i] != 0)
					c++;
			}
			return c;
		}
		public int Column(int c) {
			int count = 0;
			for (int i = 0; i < 3; i++) {
				if (tickets[i][c] != 0)
					count++;
			}
			return count;
		}
		public int EmptyCell(int c) {
			for (int i = 0; i < 3; i++) {
				if (tickets[i][c] == 0)
					return i;
			}
			return -1;
		}
	
		static int getNumberOfElementsInSet(List<List<Integer>> set) {
			int c = 0;
			for (List<Integer> li : set)
				c += li.size();
			return c;
		}
	
		public void generateTicket() {
			
			HousieTicket[] tickets = new HousieTicket[6];
			for (int i = 0; i < 6; i++) { tickets[i] = new HousieTicket(); }
	
			List<Integer> t1 = new ArrayList<Integer>();
			for (int i = 1; i <= 9; i++) { t1.add(i); }
	
			List<Integer> t2 = new ArrayList<Integer>(); 
			for (int i = 10; i <= 19; i++) { t2.add(i); }
	
			List<Integer> t3 = new ArrayList<Integer>();
			for (int i = 20; i <= 29; i++) { t3.add(i); }
	
			List<Integer> t4 = new ArrayList<Integer>();
			for (int i = 30; i <= 39; i++) { t4.add(i); }
	
			List<Integer> t5 = new ArrayList<Integer>();
			for (int i = 40; i <= 49; i++) { t5.add(i); }
	
			List<Integer> t6 = new ArrayList<Integer>();
			for (int i = 50; i <= 59; i++) { t6.add(i); }
	
			List<Integer> t7 = new ArrayList<Integer>();
			for (int i = 60; i <= 69; i++) { t7.add(i); }
	
			List<Integer> t8 = new ArrayList<Integer>();
			for (int i = 70; i <= 79; i++) { t8.add(i); }
	
			List<Integer> t9 = new ArrayList<Integer>();
			for (int i = 80; i <= 90; i++) { t9.add(i); }
	
			List<List<Integer>> cols = new ArrayList<List<Integer>>();
			cols.add(t1);cols.add(t2);cols.add(t3);cols.add(t4);cols.add(t5);cols.add(t6);cols.add(t7);cols.add(t8);cols.add(t9);
	
			List<List<Integer>> set1 = new ArrayList<List<Integer>>();List<List<Integer>> set2 = new ArrayList<List<Integer>>();
			List<List<Integer>> set3 = new ArrayList<List<Integer>>();List<List<Integer>> set4 = new ArrayList<List<Integer>>();
			List<List<Integer>> set5 = new ArrayList<List<Integer>>();List<List<Integer>> set6 = new ArrayList<List<Integer>>();
	
			for (int i = 0; i < 9; i++) {
				set1.add(new ArrayList<Integer>());set2.add(new ArrayList<Integer>());set3.add(new ArrayList<Integer>());
				set4.add(new ArrayList<Integer>());set5.add(new ArrayList<Integer>());set6.add(new ArrayList<Integer>());
			}
	
			List<List<List<Integer>>> sets = new ArrayList<List<List<Integer>>>();
	
			sets.add(set1);sets.add(set2);sets.add(set3);sets.add(set4);sets.add(set5);sets.add(set6);
	
			for (int i = 0; i < 9; i++) 
			{
				List<Integer> li = cols.get(i);
				for (int j = 0; j < 6; j++) 
				{
					int index = RandomNumber(0, li.size() - 1);
					int randomNum = li.get(index);
					List<Integer> set = sets.get(j).get(i);
					set.add(randomNum);
					li.remove(index);
				}
			}
	
			List<Integer> lastCol = cols.get(8);
			int randNumIndex = RandomNumber(0, lastCol.size() - 1);
			int randNum = lastCol.get(randNumIndex);
			int randSetIndex = RandomNumber(0, sets.size() - 1);
			List<Integer> randSet = sets.get(randSetIndex).get(8);
			randSet.add(randNum);
			lastCol.remove(randNumIndex);
			
			for (int pass = 0; pass < 3; pass++) {
				for (int i = 0; i < 9; i++) {
					List<Integer> col = cols.get(i);
					if (col.size() == 0)
						continue;
	
					int randNumIndex1 = RandomNumber(0, col.size() - 1);
					int randNums = col.get(randNumIndex1);
	
					boolean flag = false;
					while (!flag) {
						int randSetIndex1 = RandomNumber(0, sets.size() - 1);
						List<List<Integer>> randSet1 = sets.get(randSetIndex1);
	
						if (getNumberOfElementsInSet(randSet1) == 15 || randSet1.get(i).size() == 2)
							continue;
	
						flag = true;
						randSet1.get(i).add(randNums);
	
						col.remove(randNumIndex1);
					}
				}
			}
	
			for (int i = 0; i < 9; i++) {
				List<Integer> col = cols.get(i);
				if (col.size() == 0)
					continue;
	
				int randNumIndex1 = RandomNumber(0, col.size() - 1);
				int randNums = col.get(randNumIndex1);
	
				boolean flag = false;
				while (!flag) {
					int randSetIndex1 = RandomNumber(0, sets.size() - 1);
					List<List<Integer>> randSet1 = sets.get(randSetIndex1);
	
					if (getNumberOfElementsInSet(randSet1) == 15 || randSet1.get(i).size() == 3)
						continue;
	
					flag = true;
					randSet1.get(i).add(randNums);
	
					col.remove(randNumIndex1);
				}
			}
	
			for (int setIndex = 0; setIndex < 6; setIndex++) {
				List<List<Integer>> currSet = sets.get(setIndex);
				HousieTicket ticketNum = tickets[setIndex];
	
				// 1st Row
				for (int size = 3; size > 0; size--) {
					if (ticketNum.Row(0) == 5)
						break;
					for (int colIndex = 0; colIndex < 9; colIndex++) {
						if (ticketNum.Row(0) == 5)
							break;
						if (ticketNum.tickets[0][colIndex] != 0)
							continue;
	
						List<Integer> currSetCol = currSet.get(colIndex);
						if (currSetCol.size() != size)
							continue;
	
						ticketNum.tickets[0][colIndex] = currSetCol.remove(0);
					}
				}
	
				// 2nd Row
				for (int size = 2; size > 0; size--) {
					if (ticketNum.Row(1) == 5)
						break;
					for (int colIndex = 0; colIndex < 9; colIndex++) {
						if (ticketNum.Row(1) == 5)
							break;
						if (ticketNum.tickets[1][colIndex] != 0)
							continue;
	
						List<Integer> currSetCol = currSet.get(colIndex);
						if (currSetCol.size() != size)
							continue;
	
						ticketNum.tickets[1][colIndex] = currSetCol.remove(0);
					}
				}
	
				// 3rd Row
				for (int size = 1; size > 0; size--) {
					if (ticketNum.Row(2) == 5)
						break;
					for (int colIndex = 0; colIndex < 9; colIndex++) {
						if (ticketNum.Row(2) == 5)
							break;
						if (ticketNum.tickets[2][colIndex] != 0)
							continue;
	
						List<Integer> currSetCol = currSet.get(colIndex);
						if (currSetCol.size() != size)
							continue;
	
						ticketNum.tickets[2][colIndex] = currSetCol.remove(0);
					}
				}
			}
			
			//Print The Ticket
			for (int i = 0; i < 1; i++) 
			{
				HousieTicket currTicket = tickets[i];
				for (int r = 0; r < 3; r++) {
					for (int col = 0; col < 9; col++) {
						int num = currTicket.tickets[r][col];
						if (num != 0)
							System.out.print(num);
	
						if (col != 8)
							System.out.print(",");
					}
					if (r != 2)
						System.out.println();
				}
				if (i != 5) {
					System.out.println();
					System.out.println();
			}}}
		
	  public static void main(String[] args) {
		System.out.println("Housie Ticket:"+"\n");
		HousieTicket t1 = new HousieTicket();
		t1.generateTicket(); }
}