package com.kh.practice.file.model.vo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		try (BufferedReader dr = new BufferedReader(new FileReader(file))) {
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	public void fileSave(String file, String s) {
		try(BufferedWriter dr=new BufferedWriter(new FileWriter(file))){
			dr.write(s);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public StringBuilder fileOpen(String file) {

		StringBuilder sb = new StringBuilder();
		try (BufferedReader dr = new BufferedReader(new FileReader(file))) {
			String str;
			while ((str = dr.readLine()) != null) {
				sb.append(str + "\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;
	}

	public void fileEdit(String file, String s) {
		try(BufferedWriter dr=new BufferedWriter(new FileWriter(file,true))){
			dr.write(s);
			dr.flush();//버퍼사용시 해줘야된다
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
