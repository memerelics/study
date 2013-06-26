/**
 * Kuku �́A���̖��������_����10�\������
 * ���̐��𐔂Ɛ��𗦂�\������v���O�����ł���B
 *
 * @author ����_
 * @copyright 1999 by Hiroshi Yuki.
 */

import java.io.*;

public class Kuku {
    /** �\��������̌� */
    public static final int MAX_QUESTION = 10;
    /**
     * ���̖���MAX_QUESTION��J��Ԃ��ďo�肷��B
     * �Ō�ɐ�������\������B
     */
    public static void main(String[] args) {
        int goodAnswers = 0;    // �����̌�
        System.out.println("���ꂩ����̖���" + MAX_QUESTION + "��o���܂��B");
        /*
         * �ȉ��A�����J��Ԃ��\�����A���[�U����̉𓚂𔻒f����B
         * ���̌�A�����̐��𐔂���B
         */
        for (int i = 0; i < MAX_QUESTION; i++) {
            boolean ok = showQuestion(i + 1);
            if (ok) {
                goodAnswers++;
            }
        }
        double rate = goodAnswers * 100.0 / MAX_QUESTION;
        System.out.println("");
        System.out.println("����" + MAX_QUESTION + "�₠��܂����B");
        System.out.println("������������ꂽ�̂�" + goodAnswers + "��ŁA");
        System.out.println("�Ԉ���Ă��܂����̂�" + (MAX_QUESTION - goodAnswers) + "��ł��B");
        System.out.println("��������" + rate + "%�ł��B");
        System.out.println("");
        System.out.println("����ꂳ�܁B");
    }
    /**
     * showQuestion�͋��̖���1��o���A������҂B
     * �����A�듚�̕ʂ�\������B
     * �����̏ꍇ�� true ��Ԃ��B
     */
    public static boolean showQuestion(int questno) {
        int x = (int)(Math.random() * 9) + 1;
        int y = (int)(Math.random() * 9) + 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("�m��" + questno + "��n  " + x + " �~ " + y + " �� �H");
            String line = reader.readLine();
            int result = Integer.parseInt(line);
            if (x * y == result) {
                System.out.println("�͂��A�������ł��B");
                return true;
            } else {
                System.out.println("�c�O�A�܂������ł��B");
                return false;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("���͂�����������܂���B");
        }
        return false;
    }
}
