package com.chenzhe;

import java.util.BitSet;

public class BitTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitTest bt = new BitTest();
		bt.printBitSet();
		
		BitSet bs = new BitSet(4);
		
		bs.set(0);
		bs.set(63);
		System.out.println(bt.parseToInt(bt.parseToBitSet(432)));
	}

	public void printBit(int num){
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toBinaryString(num).length());
	}
	
	public void printBitSet(){
		
		BitSet bs = new BitSet(4);
		
		bs.set(0);
		bs.set(66);
		
		bs.flip(6);
		
//		System.out.println(bs);
	}
	
	public int parseToInt(BitSet bs){
		int result = 0;
		
		
		for(int i = 1;i<bs.length();i++){
			if(bs.get(i)){
				result |= 1<<i;
			}
		}
		
		return result;
	}
	
	public BitSet parseToBitSet(int num){
		BitSet bs = new BitSet();
		
		if((num & 1) == 1){
			bs.set(0);
		}
		for(int i = 0;i<32;i++){
			
			if((num & (1<<i)) != 0){
				bs.set(i);
			}
		}
		return bs;
	}
}
