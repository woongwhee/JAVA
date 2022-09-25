package com.kh.exception.charCheck.controller;

import com.kh.exception.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {
	}

	public int coutnAlpha(String s) throws CharCheckException {
		char[] cArr = s.toCharArray();
		int count = 0;
		for (int i = 0; i < cArr.length; i++) {
			if ((cArr[i] >= 'a' && cArr[i] <= 'z') || (cArr[i] >= 'A' && cArr[i] <= 'Z')) {
				count++;
			}
			if (cArr[i] == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되 있습니다.");
			}
		}
		return count;
	}
}
