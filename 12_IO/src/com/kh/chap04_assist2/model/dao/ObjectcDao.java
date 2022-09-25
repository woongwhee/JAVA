package com.kh.chap04_assist2.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist2.model.vo.Phone;

public class ObjectcDao {
	// 객체배열 저장
	public void fileSave(String fileName) {
		Phone[] arr = new Phone[10000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Phone("아이폰" + i, 1000000);
		}
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			for (int i = 0; i < arr.length; i++) {
				oos.writeObject(arr[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void fileRead() {
		try (ObjectInputStream obs = new ObjectInputStream(new FileInputStream("D_Objects.txt"))) {
			while(true)
				
                {
				
				System.out.println(obs.readObject());
				}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일을 다읽었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
