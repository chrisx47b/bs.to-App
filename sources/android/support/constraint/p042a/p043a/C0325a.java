package android.support.constraint.p042a.p043a;

import android.support.constraint.p042a.p043a.C0335h.C0336a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.constraint.a.a.a */
/* compiled from: Analyzer */
public class C0325a {
    /* renamed from: a */
    public static void m1052a(C0337i iVar) {
        if ((iVar.mo1209M() & 32) != 32) {
            m1057b(iVar);
            return;
        }
        iVar.f995Oa = true;
        iVar.f989Ia = false;
        iVar.f990Ja = false;
        iVar.f991Ka = false;
        ArrayList<C0335h> arrayList = iVar.f1053va;
        List<C0338j> list = iVar.f988Ha;
        boolean z = iVar.mo1180j() == C0336a.WRAP_CONTENT;
        boolean z2 = iVar.mo1194q() == C0336a.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (C0335h hVar : arrayList) {
            hVar.f965s = null;
            hVar.f952la = false;
            hVar.mo1106F();
        }
        for (C0335h hVar2 : arrayList) {
            if (hVar2.f965s == null && !m1056a(hVar2, list, z3)) {
                m1057b(iVar);
                iVar.f995Oa = false;
                return;
            }
        }
        int i = 0;
        int i2 = 0;
        for (C0338j jVar : list) {
            i = Math.max(i, m1049a(jVar, 0));
            i2 = Math.max(i2, m1049a(jVar, 1));
        }
        if (z) {
            iVar.mo1143a(C0336a.FIXED);
            iVar.mo1191o(i);
            iVar.f989Ia = true;
            iVar.f990Ja = true;
            iVar.f992La = i;
        }
        if (z2) {
            iVar.mo1156b(C0336a.FIXED);
            iVar.mo1175g(i2);
            iVar.f989Ia = true;
            iVar.f991Ka = true;
            iVar.f993Ma = i2;
        }
        m1054a(list, 0, iVar.mo1198s());
        m1054a(list, 1, iVar.mo1178i());
    }

    /* renamed from: b */
    private static void m1057b(C0337i iVar) {
        iVar.f988Ha.clear();
        iVar.f988Ha.add(0, new C0338j(iVar.f1053va));
    }

    /* renamed from: a */
    private static boolean m1056a(C0335h hVar, List<C0338j> list, boolean z) {
        C0338j jVar = new C0338j(new ArrayList(), true);
        list.add(jVar);
        return m1055a(hVar, jVar, list, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0181, code lost:
        if (r3.f875b == r4) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0128, code lost:
        if (r3.f875b == r4) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01c2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m1055a(android.support.constraint.p042a.p043a.C0335h r8, android.support.constraint.p042a.p043a.C0338j r9, java.util.List<android.support.constraint.p042a.p043a.C0338j> r10, boolean r11) {
        /*
            r0 = 1
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            r8.f950ka = r1
            android.support.constraint.a.a.h r2 = r8.mo1182k()
            android.support.constraint.a.a.i r2 = (android.support.constraint.p042a.p043a.C0337i) r2
            android.support.constraint.a.a.j r3 = r8.f965s
            if (r3 != 0) goto L_0x01f0
            r8.f948ja = r0
            java.util.List<android.support.constraint.a.a.h> r3 = r9.f1003a
            r3.add(r8)
            r8.f965s = r9
            android.support.constraint.a.a.f r3 = r8.f971v
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 != 0) goto L_0x0044
            android.support.constraint.a.a.f r3 = r8.f973x
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 != 0) goto L_0x0044
            android.support.constraint.a.a.f r3 = r8.f972w
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 != 0) goto L_0x0044
            android.support.constraint.a.a.f r3 = r8.f974y
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 != 0) goto L_0x0044
            android.support.constraint.a.a.f r3 = r8.f975z
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 != 0) goto L_0x0044
            android.support.constraint.a.a.f r3 = r8.f906C
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 != 0) goto L_0x0044
            m1053a(r2, r8, r9)
            if (r11 == 0) goto L_0x0044
            return r1
        L_0x0044:
            android.support.constraint.a.a.f r3 = r8.f972w
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x0077
            android.support.constraint.a.a.f r3 = r8.f974y
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x0077
            android.support.constraint.a.a.h$a r3 = r2.mo1194q()
            android.support.constraint.a.a.h$a r4 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r11 == 0) goto L_0x005c
            m1053a(r2, r8, r9)
            return r1
        L_0x005c:
            android.support.constraint.a.a.f r3 = r8.f972w
            android.support.constraint.a.a.f r3 = r3.f877d
            android.support.constraint.a.a.h r3 = r3.f875b
            android.support.constraint.a.a.h r4 = r8.mo1182k()
            if (r3 != r4) goto L_0x0074
            android.support.constraint.a.a.f r3 = r8.f974y
            android.support.constraint.a.a.f r3 = r3.f877d
            android.support.constraint.a.a.h r3 = r3.f875b
            android.support.constraint.a.a.h r4 = r8.mo1182k()
            if (r3 == r4) goto L_0x0077
        L_0x0074:
            m1053a(r2, r8, r9)
        L_0x0077:
            android.support.constraint.a.a.f r3 = r8.f971v
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x00aa
            android.support.constraint.a.a.f r3 = r8.f973x
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x00aa
            android.support.constraint.a.a.h$a r3 = r2.mo1180j()
            android.support.constraint.a.a.h$a r4 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r11 == 0) goto L_0x008f
            m1053a(r2, r8, r9)
            return r1
        L_0x008f:
            android.support.constraint.a.a.f r3 = r8.f971v
            android.support.constraint.a.a.f r3 = r3.f877d
            android.support.constraint.a.a.h r3 = r3.f875b
            android.support.constraint.a.a.h r4 = r8.mo1182k()
            if (r3 != r4) goto L_0x00a7
            android.support.constraint.a.a.f r3 = r8.f973x
            android.support.constraint.a.a.f r3 = r3.f877d
            android.support.constraint.a.a.h r3 = r3.f875b
            android.support.constraint.a.a.h r4 = r8.mo1182k()
            if (r3 == r4) goto L_0x00aa
        L_0x00a7:
            m1053a(r2, r8, r9)
        L_0x00aa:
            android.support.constraint.a.a.h$a r3 = r8.mo1180j()
            android.support.constraint.a.a.h$a r4 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r3 != r4) goto L_0x00b4
            r3 = 1
            goto L_0x00b5
        L_0x00b4:
            r3 = 0
        L_0x00b5:
            android.support.constraint.a.a.h$a r4 = r8.mo1194q()
            android.support.constraint.a.a.h$a r5 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x00bf
            r4 = 1
            goto L_0x00c0
        L_0x00bf:
            r4 = 0
        L_0x00c0:
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x00ce
            float r3 = r8.f913J
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x00ce
            m1046a(r8)
            goto L_0x00e4
        L_0x00ce:
            android.support.constraint.a.a.h$a r3 = r8.mo1180j()
            android.support.constraint.a.a.h$a r4 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r3 == r4) goto L_0x00de
            android.support.constraint.a.a.h$a r3 = r8.mo1194q()
            android.support.constraint.a.a.h$a r4 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r3 != r4) goto L_0x00e4
        L_0x00de:
            m1053a(r2, r8, r9)
            if (r11 == 0) goto L_0x00e4
            return r1
        L_0x00e4:
            android.support.constraint.a.a.f r3 = r8.f971v
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 != 0) goto L_0x00f0
            android.support.constraint.a.a.f r3 = r8.f973x
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x012a
        L_0x00f0:
            android.support.constraint.a.a.f r3 = r8.f971v
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x0102
            android.support.constraint.a.a.h r3 = r3.f875b
            android.support.constraint.a.a.h r4 = r8.f910G
            if (r3 != r4) goto L_0x0102
            android.support.constraint.a.a.f r3 = r8.f973x
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x012a
        L_0x0102:
            android.support.constraint.a.a.f r3 = r8.f973x
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x0114
            android.support.constraint.a.a.h r3 = r3.f875b
            android.support.constraint.a.a.h r4 = r8.f910G
            if (r3 != r4) goto L_0x0114
            android.support.constraint.a.a.f r3 = r8.f971v
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x012a
        L_0x0114:
            android.support.constraint.a.a.f r3 = r8.f971v
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x013d
            android.support.constraint.a.a.h r3 = r3.f875b
            android.support.constraint.a.a.h r4 = r8.f910G
            if (r3 != r4) goto L_0x013d
            android.support.constraint.a.a.f r3 = r8.f973x
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x013d
            android.support.constraint.a.a.h r3 = r3.f875b
            if (r3 != r4) goto L_0x013d
        L_0x012a:
            android.support.constraint.a.a.f r3 = r8.f906C
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 != 0) goto L_0x013d
            boolean r3 = r8 instanceof android.support.constraint.p042a.p043a.C0340l
            if (r3 != 0) goto L_0x013d
            boolean r3 = r8 instanceof android.support.constraint.p042a.p043a.C0341m
            if (r3 != 0) goto L_0x013d
            java.util.List<android.support.constraint.a.a.h> r3 = r9.f1008f
            r3.add(r8)
        L_0x013d:
            android.support.constraint.a.a.f r3 = r8.f972w
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 != 0) goto L_0x0149
            android.support.constraint.a.a.f r3 = r8.f974y
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x0183
        L_0x0149:
            android.support.constraint.a.a.f r3 = r8.f972w
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x015b
            android.support.constraint.a.a.h r3 = r3.f875b
            android.support.constraint.a.a.h r4 = r8.f910G
            if (r3 != r4) goto L_0x015b
            android.support.constraint.a.a.f r3 = r8.f974y
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x0183
        L_0x015b:
            android.support.constraint.a.a.f r3 = r8.f974y
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x016d
            android.support.constraint.a.a.h r3 = r3.f875b
            android.support.constraint.a.a.h r4 = r8.f910G
            if (r3 != r4) goto L_0x016d
            android.support.constraint.a.a.f r3 = r8.f972w
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x0183
        L_0x016d:
            android.support.constraint.a.a.f r3 = r8.f972w
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x019c
            android.support.constraint.a.a.h r3 = r3.f875b
            android.support.constraint.a.a.h r4 = r8.f910G
            if (r3 != r4) goto L_0x019c
            android.support.constraint.a.a.f r3 = r8.f974y
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x019c
            android.support.constraint.a.a.h r3 = r3.f875b
            if (r3 != r4) goto L_0x019c
        L_0x0183:
            android.support.constraint.a.a.f r3 = r8.f906C
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 != 0) goto L_0x019c
            android.support.constraint.a.a.f r3 = r8.f975z
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 != 0) goto L_0x019c
            boolean r3 = r8 instanceof android.support.constraint.p042a.p043a.C0340l
            if (r3 != 0) goto L_0x019c
            boolean r3 = r8 instanceof android.support.constraint.p042a.p043a.C0341m
            if (r3 != 0) goto L_0x019c
            java.util.List<android.support.constraint.a.a.h> r3 = r9.f1009g
            r3.add(r8)
        L_0x019c:
            boolean r3 = r8 instanceof android.support.constraint.p042a.p043a.C0341m
            if (r3 == 0) goto L_0x01bc
            m1053a(r2, r8, r9)
            if (r11 == 0) goto L_0x01a6
            return r1
        L_0x01a6:
            r3 = r8
            android.support.constraint.a.a.m r3 = (android.support.constraint.p042a.p043a.C0341m) r3
            r4 = 0
        L_0x01aa:
            int r5 = r3.f1025wa
            if (r4 >= r5) goto L_0x01bc
            android.support.constraint.a.a.h[] r5 = r3.f1024va
            r5 = r5[r4]
            boolean r5 = m1055a(r5, r9, r10, r11)
            if (r5 != 0) goto L_0x01b9
            return r1
        L_0x01b9:
            int r4 = r4 + 1
            goto L_0x01aa
        L_0x01bc:
            android.support.constraint.a.a.f[] r3 = r8.f907D
            int r3 = r3.length
            r4 = 0
        L_0x01c0:
            if (r4 >= r3) goto L_0x01ef
            android.support.constraint.a.a.f[] r5 = r8.f907D
            r5 = r5[r4]
            android.support.constraint.a.a.f r6 = r5.f877d
            if (r6 == 0) goto L_0x01ec
            android.support.constraint.a.a.h r6 = r6.f875b
            android.support.constraint.a.a.h r7 = r8.mo1182k()
            if (r6 == r7) goto L_0x01ec
            android.support.constraint.a.a.f$c r6 = r5.f876c
            android.support.constraint.a.a.f$c r7 = android.support.constraint.p042a.p043a.C0330f.C0333c.CENTER
            if (r6 != r7) goto L_0x01de
            m1053a(r2, r8, r9)
            if (r11 == 0) goto L_0x01e1
            return r1
        L_0x01de:
            m1050a(r5)
        L_0x01e1:
            android.support.constraint.a.a.f r5 = r5.f877d
            android.support.constraint.a.a.h r5 = r5.f875b
            boolean r5 = m1055a(r5, r9, r10, r11)
            if (r5 != 0) goto L_0x01ec
            return r1
        L_0x01ec:
            int r4 = r4 + 1
            goto L_0x01c0
        L_0x01ef:
            return r0
        L_0x01f0:
            if (r3 == r9) goto L_0x022f
            java.util.List<android.support.constraint.a.a.h> r11 = r9.f1003a
            java.util.List<android.support.constraint.a.a.h> r2 = r3.f1003a
            r11.addAll(r2)
            java.util.List<android.support.constraint.a.a.h> r11 = r9.f1008f
            android.support.constraint.a.a.j r2 = r8.f965s
            java.util.List<android.support.constraint.a.a.h> r2 = r2.f1008f
            r11.addAll(r2)
            java.util.List<android.support.constraint.a.a.h> r11 = r9.f1009g
            android.support.constraint.a.a.j r2 = r8.f965s
            java.util.List<android.support.constraint.a.a.h> r2 = r2.f1009g
            r11.addAll(r2)
            android.support.constraint.a.a.j r11 = r8.f965s
            boolean r11 = r11.f1006d
            if (r11 != 0) goto L_0x0213
            r9.f1006d = r1
        L_0x0213:
            android.support.constraint.a.a.j r11 = r8.f965s
            r10.remove(r11)
            android.support.constraint.a.a.j r8 = r8.f965s
            java.util.List<android.support.constraint.a.a.h> r8 = r8.f1003a
            java.util.Iterator r8 = r8.iterator()
        L_0x0220:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x022f
            java.lang.Object r10 = r8.next()
            android.support.constraint.a.a.h r10 = (android.support.constraint.p042a.p043a.C0335h) r10
            r10.f965s = r9
            goto L_0x0220
        L_0x022f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p042a.p043a.C0325a.m1055a(android.support.constraint.a.a.h, android.support.constraint.a.a.j, java.util.List, boolean):boolean");
    }

    /* renamed from: a */
    private static void m1053a(C0337i iVar, C0335h hVar, C0338j jVar) {
        jVar.f1006d = false;
        iVar.f995Oa = false;
        hVar.f948ja = false;
    }

    /* renamed from: a */
    private static int m1049a(C0338j jVar, int i) {
        int i2 = i * 2;
        List a = jVar.mo1225a(i);
        int size = a.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C0335h hVar = (C0335h) a.get(i4);
            C0330f[] fVarArr = hVar.f907D;
            int i5 = i2 + 1;
            i3 = Math.max(i3, m1048a(hVar, i, fVarArr[i5].f877d == null || !(fVarArr[i2].f877d == null || fVarArr[i5].f877d == null), 0));
        }
        jVar.f1007e[i] = i3;
        return i3;
    }

    /* renamed from: a */
    private static int m1048a(C0335h hVar, int i, boolean z, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int s;
        int i9;
        int i10;
        int i11;
        C0335h hVar2 = hVar;
        int i12 = i;
        boolean z2 = z;
        int i13 = 0;
        if (!hVar2.f948ja) {
            return 0;
        }
        boolean z3 = hVar2.f975z.f877d != null && i12 == 1;
        if (z2) {
            i6 = hVar.mo1160c();
            i5 = hVar.mo1178i() - hVar.mo1160c();
            i4 = i12 * 2;
            i3 = i4 + 1;
        } else {
            i6 = hVar.mo1178i() - hVar.mo1160c();
            i5 = hVar.mo1160c();
            i3 = i12 * 2;
            i4 = i3 + 1;
        }
        C0330f[] fVarArr = hVar2.f907D;
        if (fVarArr[i3].f877d == null || fVarArr[i4].f877d != null) {
            i7 = i3;
            i8 = 1;
        } else {
            i7 = i4;
            i4 = i3;
            i8 = -1;
        }
        int b = (hVar2.f907D[i4].mo1119b() * i8) + m1047a(hVar, i);
        int i14 = (z3 ? i2 - i6 : i2) + b;
        int s2 = (i12 == 0 ? hVar.mo1198s() : hVar.mo1178i()) * i8;
        Iterator it = hVar2.f907D[i4].mo1121d().f1041a.iterator();
        while (it.hasNext()) {
            i13 = Math.max(i13, m1048a(((C0344p) it.next()).f1027c.f875b, i12, z2, i14));
        }
        Iterator it2 = hVar2.f907D[i7].mo1121d().f1041a.iterator();
        int i15 = 0;
        while (it2.hasNext()) {
            Iterator it3 = it2;
            i15 = Math.max(i15, m1048a(((C0344p) it2.next()).f1027c.f875b, i12, z2, s2 + i14));
            it2 = it3;
        }
        if (z3) {
            i13 -= i6;
            s = i15 + i5;
        } else {
            s = i15 + ((i12 == 0 ? hVar.mo1198s() : hVar.mo1178i()) * i8);
        }
        int i16 = 1;
        if (i12 == 1) {
            Iterator it4 = hVar2.f975z.mo1121d().f1041a.iterator();
            int i17 = 0;
            while (it4.hasNext()) {
                Iterator it5 = it4;
                C0344p pVar = (C0344p) it4.next();
                if (i8 == i16) {
                    i17 = Math.max(i17, m1048a(pVar.f1027c.f875b, i12, z2, i6 + i14));
                    i11 = i7;
                } else {
                    i11 = i7;
                    i17 = Math.max(i17, m1048a(pVar.f1027c.f875b, i12, z2, (i5 * i8) + i14));
                }
                it4 = it5;
                i7 = i11;
                i16 = 1;
            }
            i9 = i7;
            int i18 = i17;
            i10 = (hVar2.f975z.mo1121d().f1041a.size() <= 0 || z3) ? i18 : i8 == 1 ? i18 + i6 : i18 - i5;
        } else {
            i9 = i7;
            i10 = 0;
        }
        int max = b + Math.max(i13, Math.max(s, i10));
        int i19 = i14 + s2;
        if (i8 != -1) {
            int i20 = i14;
            i14 = i19;
            i19 = i20;
        }
        if (z2) {
            C0342n.m1213a(hVar2, i12, i19);
            hVar2.mo1139a(i19, i14, i12);
        } else {
            hVar2.f965s.mo1226a(hVar2, i12);
            hVar2.mo1168d(i19, i12);
        }
        if (hVar.mo1161c(i) == C0336a.MATCH_CONSTRAINT && hVar2.f913J != 0.0f) {
            hVar2.f965s.mo1226a(hVar2, i12);
        }
        C0330f[] fVarArr2 = hVar2.f907D;
        if (!(fVarArr2[i4].f877d == null || fVarArr2[i9].f877d == null)) {
            C0335h k = hVar.mo1182k();
            C0330f[] fVarArr3 = hVar2.f907D;
            if (fVarArr3[i4].f877d.f875b == k && fVarArr3[i9].f877d.f875b == k) {
                hVar2.f965s.mo1226a(hVar2, i12);
            }
        }
        return max;
    }

    /* renamed from: a */
    private static void m1050a(C0330f fVar) {
        C0344p d = fVar.mo1121d();
        C0330f fVar2 = fVar.f877d;
        if (fVar2 != null && fVar2.f877d != fVar) {
            fVar2.mo1121d().mo1251a(d);
        }
    }

    /* renamed from: a */
    public static void m1054a(List<C0338j> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (C0335h hVar : ((C0338j) list.get(i3)).mo1227b(i)) {
                if (hVar.f948ja) {
                    m1051a(hVar, i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m1051a(C0335h hVar, int i, int i2) {
        int i3 = i * 2;
        C0330f[] fVarArr = hVar.f907D;
        C0330f fVar = fVarArr[i3];
        C0330f fVar2 = fVarArr[i3 + 1];
        if ((fVar.f877d == null || fVar2.f877d == null) ? false : true) {
            C0342n.m1213a(hVar, i, m1047a(hVar, i) + fVar.mo1119b());
        } else if (hVar.f913J == 0.0f || hVar.mo1161c(i) != C0336a.MATCH_CONSTRAINT) {
            int e = i2 - hVar.mo1169e(i);
            int d = e - hVar.mo1166d(i);
            hVar.mo1139a(d, e, i);
            C0342n.m1213a(hVar, i, d);
        } else {
            int a = m1046a(hVar);
            int i4 = (int) hVar.f907D[i3].mo1121d().f1032h;
            int i5 = i4 + a;
            fVar2.mo1121d().f1031g = fVar.mo1121d();
            fVar2.mo1121d().f1032h = (float) a;
            fVar2.mo1121d().f1042b = 1;
            hVar.mo1139a(i4, i5, i);
        }
    }

    /* renamed from: a */
    private static int m1047a(C0335h hVar, int i) {
        int i2 = i * 2;
        C0330f[] fVarArr = hVar.f907D;
        C0330f fVar = fVarArr[i2];
        C0330f fVar2 = fVarArr[i2 + 1];
        C0330f fVar3 = fVar.f877d;
        if (fVar3 != null) {
            C0335h hVar2 = fVar3.f875b;
            C0335h hVar3 = hVar.f910G;
            if (hVar2 == hVar3) {
                C0330f fVar4 = fVar2.f877d;
                if (fVar4 != null && fVar4.f875b == hVar3) {
                    return (int) (((float) (((hVar3.mo1166d(i) - fVar.mo1119b()) - fVar2.mo1119b()) - hVar.mo1166d(i))) * (i == 0 ? hVar.f930aa : hVar.f932ba));
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static int m1046a(C0335h hVar) {
        float f;
        float f2;
        if (hVar.mo1180j() == C0336a.MATCH_CONSTRAINT) {
            if (hVar.f914K == 0) {
                f2 = ((float) hVar.mo1178i()) * hVar.f913J;
            } else {
                f2 = ((float) hVar.mo1178i()) / hVar.f913J;
            }
            int i = (int) f2;
            hVar.mo1191o(i);
            return i;
        } else if (hVar.mo1194q() != C0336a.MATCH_CONSTRAINT) {
            return -1;
        } else {
            if (hVar.f914K == 1) {
                f = ((float) hVar.mo1198s()) * hVar.f913J;
            } else {
                f = ((float) hVar.mo1198s()) / hVar.f913J;
            }
            int i2 = (int) f;
            hVar.mo1175g(i2);
            return i2;
        }
    }
}
