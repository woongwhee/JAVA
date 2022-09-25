package com.kh.practice.book.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.vo.Book;

public class BookDAO {
	public void fileSave(Book[] bArr) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt", true));) {
			for (int i = 0; i < bArr.length; i++) {
				if (bArr[i] != null) {
					oos.writeObject(bArr[i]);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void fileSave(Book[] bArr,int i) {
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt", true));) {
			oos.writeObject(bArr[i]);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public Book[] fileRead() {
		
		int i=10;//10개단위로 배열칸을 늘려줌
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("book.txt"))){//배열 크기를 정함
			while(true) {
				i++;
				ois.readObject();
			}
		}catch(ClassNotFoundException e) {e.printStackTrace();}
		catch(EOFException e) {}
		catch(FileNotFoundException e) {e.printStackTrace();}
		catch(IOException e) {e.printStackTrace();}
		Book[] bArr=new Book[i];
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("book.txt"))){//배열 크기를 정함
			i=0;
			while(true) {
				
				bArr[i++]=(Book)ois.readObject();
				
			}
		}catch(ClassNotFoundException e) {e.printStackTrace();}
		catch(EOFException e) {}
		catch(FileNotFoundException e) {e.printStackTrace();}
		catch(IOException e) {e.printStackTrace();}
		return bArr;
	}
}
