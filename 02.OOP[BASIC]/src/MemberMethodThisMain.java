
public class MemberMethodThisMain {

	public static void main(String[] args) {

		System.out.println("---------------mmt1----------------");

		MemberMethodThis mmt1 = new MemberMethodThis();
		// mmt1.memberfield1=11;
		// mmt1.memberfield2=22;
		mmt1.setMemberField1(11);
		mmt1.setMemberField2(22);

		// System.out.println(mmt1.memberField1);
		// System.out.println(mmt1.memberField2);

		System.out.println(mmt1.getMemberField1());
		System.out.println(mmt1.getMemberField2());

		System.out.println("---------------mmt2----------------");

		MemberMethodThis mmt2 = new MemberMethodThis();
		// mmt2.memberfield1=11;
		// mmt2.memberfield2=22;
		mmt2.setMemberField1(11);
		mmt2.setMemberField2(22);

		// System.out.println(mmt2.memberField1);
		// System.out.println(mmt2.memberField2);

		System.out.println(mmt2.getMemberField1());
		System.out.println(mmt2.getMemberField2());

	}

}
