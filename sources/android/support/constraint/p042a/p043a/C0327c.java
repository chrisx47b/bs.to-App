package android.support.constraint.p042a.p043a;

import android.support.constraint.p042a.C0353e;

/* renamed from: android.support.constraint.a.a.c */
/* compiled from: Chain */
class C0327c {
    /* renamed from: a */
    static void m1065a(C0337i iVar, C0353e eVar, int i) {
        int i2;
        C0328d[] dVarArr;
        int i3;
        if (i == 0) {
            int i4 = iVar.f984Da;
            dVarArr = iVar.f987Ga;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            int i5 = iVar.f985Ea;
            i2 = i5;
            dVarArr = iVar.f986Fa;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            C0328d dVar = dVarArr[i6];
            dVar.mo1113a();
            if (!iVar.mo1112t(4)) {
                m1066a(iVar, eVar, i, i3, dVar);
            } else if (!C0342n.m1216a(iVar, eVar, i, i3, dVar)) {
                m1066a(iVar, eVar, i, i3, dVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2.f954ma == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r2.f956na == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0454  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0367 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m1066a(android.support.constraint.p042a.p043a.C0337i r36, android.support.constraint.p042a.C0353e r37, int r38, int r39, android.support.constraint.p042a.p043a.C0328d r40) {
        /*
            r0 = r36
            r9 = r37
            r1 = r40
            android.support.constraint.a.a.h r10 = r1.f856a
            android.support.constraint.a.a.h r11 = r1.f858c
            android.support.constraint.a.a.h r12 = r1.f857b
            android.support.constraint.a.a.h r13 = r1.f859d
            android.support.constraint.a.a.h r2 = r1.f860e
            float r3 = r1.f866k
            android.support.constraint.a.a.h r4 = r1.f861f
            android.support.constraint.a.a.h r4 = r1.f862g
            android.support.constraint.a.a.h$a[] r4 = r0.f909F
            r4 = r4[r38]
            android.support.constraint.a.a.h$a r5 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            r5 = 2
            if (r38 != 0) goto L_0x0038
            int r8 = r2.f954ma
            if (r8 != 0) goto L_0x002b
            r8 = 1
            goto L_0x002c
        L_0x002b:
            r8 = 0
        L_0x002c:
            int r14 = r2.f954ma
            if (r14 != r7) goto L_0x0032
            r14 = 1
            goto L_0x0033
        L_0x0032:
            r14 = 0
        L_0x0033:
            int r15 = r2.f954ma
            if (r15 != r5) goto L_0x004c
            goto L_0x004a
        L_0x0038:
            int r8 = r2.f956na
            if (r8 != 0) goto L_0x003e
            r8 = 1
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            int r14 = r2.f956na
            if (r14 != r7) goto L_0x0045
            r14 = 1
            goto L_0x0046
        L_0x0045:
            r14 = 0
        L_0x0046:
            int r15 = r2.f956na
            if (r15 != r5) goto L_0x004c
        L_0x004a:
            r5 = 1
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            r15 = r8
            r8 = r10
            r16 = r14
            r14 = r5
            r5 = 0
        L_0x0053:
            r21 = 0
            if (r5 != 0) goto L_0x0124
            android.support.constraint.a.a.f[] r7 = r8.f907D
            r7 = r7[r39]
            if (r4 != 0) goto L_0x0063
            if (r14 == 0) goto L_0x0060
            goto L_0x0063
        L_0x0060:
            r23 = 4
            goto L_0x0065
        L_0x0063:
            r23 = 1
        L_0x0065:
            int r24 = r7.mo1119b()
            android.support.constraint.a.a.f r6 = r7.f877d
            if (r6 == 0) goto L_0x0075
            if (r8 == r10) goto L_0x0075
            int r6 = r6.mo1119b()
            int r24 = r24 + r6
        L_0x0075:
            r6 = r24
            if (r14 == 0) goto L_0x0083
            if (r8 == r10) goto L_0x0083
            if (r8 == r12) goto L_0x0083
            r24 = r3
            r23 = r5
            r3 = 6
            goto L_0x0093
        L_0x0083:
            if (r15 == 0) goto L_0x008d
            if (r4 == 0) goto L_0x008d
            r24 = r3
            r23 = r5
            r3 = 4
            goto L_0x0093
        L_0x008d:
            r24 = r3
            r3 = r23
            r23 = r5
        L_0x0093:
            android.support.constraint.a.a.f r5 = r7.f877d
            if (r5 == 0) goto L_0x00bc
            if (r8 != r12) goto L_0x00a6
            r25 = r15
            android.support.constraint.a.i r15 = r7.f883j
            android.support.constraint.a.i r5 = r5.f883j
            r26 = r2
            r2 = 5
            r9.mo1302b(r15, r5, r6, r2)
            goto L_0x00b2
        L_0x00a6:
            r26 = r2
            r25 = r15
            android.support.constraint.a.i r2 = r7.f883j
            android.support.constraint.a.i r5 = r5.f883j
            r15 = 6
            r9.mo1302b(r2, r5, r6, r15)
        L_0x00b2:
            android.support.constraint.a.i r2 = r7.f883j
            android.support.constraint.a.a.f r5 = r7.f877d
            android.support.constraint.a.i r5 = r5.f883j
            r9.mo1288a(r2, r5, r6, r3)
            goto L_0x00c0
        L_0x00bc:
            r26 = r2
            r25 = r15
        L_0x00c0:
            if (r4 == 0) goto L_0x00f5
            int r2 = r8.mo1196r()
            r3 = 8
            if (r2 == r3) goto L_0x00e4
            android.support.constraint.a.a.h$a[] r2 = r8.f909F
            r2 = r2[r38]
            android.support.constraint.a.a.h$a r3 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00e4
            android.support.constraint.a.a.f[] r2 = r8.f907D
            int r3 = r39 + 1
            r3 = r2[r3]
            android.support.constraint.a.i r3 = r3.f883j
            r2 = r2[r39]
            android.support.constraint.a.i r2 = r2.f883j
            r5 = 5
            r6 = 0
            r9.mo1302b(r3, r2, r6, r5)
            goto L_0x00e5
        L_0x00e4:
            r6 = 0
        L_0x00e5:
            android.support.constraint.a.a.f[] r2 = r8.f907D
            r2 = r2[r39]
            android.support.constraint.a.i r2 = r2.f883j
            android.support.constraint.a.a.f[] r3 = r0.f907D
            r3 = r3[r39]
            android.support.constraint.a.i r3 = r3.f883j
            r5 = 6
            r9.mo1302b(r2, r3, r6, r5)
        L_0x00f5:
            android.support.constraint.a.a.f[] r2 = r8.f907D
            int r3 = r39 + 1
            r2 = r2[r3]
            android.support.constraint.a.a.f r2 = r2.f877d
            if (r2 == 0) goto L_0x0114
            android.support.constraint.a.a.h r2 = r2.f875b
            android.support.constraint.a.a.f[] r3 = r2.f907D
            r5 = r3[r39]
            android.support.constraint.a.a.f r5 = r5.f877d
            if (r5 == 0) goto L_0x0114
            r3 = r3[r39]
            android.support.constraint.a.a.f r3 = r3.f877d
            android.support.constraint.a.a.h r3 = r3.f875b
            if (r3 == r8) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r21 = r2
        L_0x0114:
            if (r21 == 0) goto L_0x011b
            r8 = r21
            r5 = r23
            goto L_0x011c
        L_0x011b:
            r5 = 1
        L_0x011c:
            r3 = r24
            r15 = r25
            r2 = r26
            goto L_0x0053
        L_0x0124:
            r26 = r2
            r24 = r3
            r25 = r15
            if (r13 == 0) goto L_0x014c
            android.support.constraint.a.a.f[] r2 = r11.f907D
            int r3 = r39 + 1
            r5 = r2[r3]
            android.support.constraint.a.a.f r5 = r5.f877d
            if (r5 == 0) goto L_0x014c
            android.support.constraint.a.a.f[] r5 = r13.f907D
            r5 = r5[r3]
            android.support.constraint.a.i r6 = r5.f883j
            r2 = r2[r3]
            android.support.constraint.a.a.f r2 = r2.f877d
            android.support.constraint.a.i r2 = r2.f883j
            int r3 = r5.mo1119b()
            int r3 = -r3
            r7 = 5
            r9.mo1305c(r6, r2, r3, r7)
            goto L_0x014d
        L_0x014c:
            r7 = 5
        L_0x014d:
            if (r4 == 0) goto L_0x0167
            android.support.constraint.a.a.f[] r0 = r0.f907D
            int r2 = r39 + 1
            r0 = r0[r2]
            android.support.constraint.a.i r0 = r0.f883j
            android.support.constraint.a.a.f[] r3 = r11.f907D
            r4 = r3[r2]
            android.support.constraint.a.i r4 = r4.f883j
            r2 = r3[r2]
            int r2 = r2.mo1119b()
            r3 = 6
            r9.mo1302b(r0, r4, r2, r3)
        L_0x0167:
            java.util.ArrayList<android.support.constraint.a.a.h> r0 = r1.f863h
            if (r0 == 0) goto L_0x0216
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0216
            boolean r4 = r1.f869n
            if (r4 == 0) goto L_0x017e
            boolean r4 = r1.f871p
            if (r4 != 0) goto L_0x017e
            int r4 = r1.f865j
            float r4 = (float) r4
            goto L_0x0180
        L_0x017e:
            r4 = r24
        L_0x0180:
            r5 = 0
            r8 = r21
            r6 = 0
            r28 = 0
        L_0x0186:
            if (r6 >= r2) goto L_0x0216
            java.lang.Object r15 = r0.get(r6)
            android.support.constraint.a.a.h r15 = (android.support.constraint.p042a.p043a.C0335h) r15
            float[] r3 = r15.f962qa
            r3 = r3[r38]
            int r23 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r23 >= 0) goto L_0x01b2
            boolean r3 = r1.f871p
            if (r3 == 0) goto L_0x01ad
            android.support.constraint.a.a.f[] r3 = r15.f907D
            int r15 = r39 + 1
            r15 = r3[r15]
            android.support.constraint.a.i r15 = r15.f883j
            r3 = r3[r39]
            android.support.constraint.a.i r3 = r3.f883j
            r5 = 0
            r7 = 4
            r9.mo1288a(r15, r3, r5, r7)
            r7 = 6
            goto L_0x01c8
        L_0x01ad:
            r7 = 4
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            goto L_0x01b3
        L_0x01b2:
            r7 = 4
        L_0x01b3:
            int r20 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r20 != 0) goto L_0x01cd
            android.support.constraint.a.a.f[] r3 = r15.f907D
            int r15 = r39 + 1
            r15 = r3[r15]
            android.support.constraint.a.i r15 = r15.f883j
            r3 = r3[r39]
            android.support.constraint.a.i r3 = r3.f883j
            r5 = 0
            r7 = 6
            r9.mo1288a(r15, r3, r5, r7)
        L_0x01c8:
            r24 = r0
            r22 = r2
            goto L_0x020b
        L_0x01cd:
            r5 = 0
            r7 = 6
            if (r8 == 0) goto L_0x0204
            android.support.constraint.a.a.f[] r8 = r8.f907D
            r5 = r8[r39]
            android.support.constraint.a.i r5 = r5.f883j
            int r22 = r39 + 1
            r8 = r8[r22]
            android.support.constraint.a.i r8 = r8.f883j
            android.support.constraint.a.a.f[] r7 = r15.f907D
            r24 = r0
            r0 = r7[r39]
            android.support.constraint.a.i r0 = r0.f883j
            r7 = r7[r22]
            android.support.constraint.a.i r7 = r7.f883j
            r22 = r2
            android.support.constraint.a.b r2 = r37.mo1301b()
            r27 = r2
            r29 = r4
            r30 = r3
            r31 = r5
            r32 = r8
            r33 = r0
            r34 = r7
            r27.mo1261a(r28, r29, r30, r31, r32, r33, r34)
            r9.mo1293a(r2)
            goto L_0x0208
        L_0x0204:
            r24 = r0
            r22 = r2
        L_0x0208:
            r28 = r3
            r8 = r15
        L_0x020b:
            int r6 = r6 + 1
            r2 = r22
            r0 = r24
            r3 = 1
            r5 = 0
            r7 = 5
            goto L_0x0186
        L_0x0216:
            if (r12 == 0) goto L_0x0278
            if (r12 == r13) goto L_0x021c
            if (r14 == 0) goto L_0x0278
        L_0x021c:
            android.support.constraint.a.a.f[] r0 = r10.f907D
            r1 = r0[r39]
            android.support.constraint.a.a.f[] r2 = r11.f907D
            int r3 = r39 + 1
            r2 = r2[r3]
            r4 = r0[r39]
            android.support.constraint.a.a.f r4 = r4.f877d
            if (r4 == 0) goto L_0x0234
            r0 = r0[r39]
            android.support.constraint.a.a.f r0 = r0.f877d
            android.support.constraint.a.i r0 = r0.f883j
            r4 = r0
            goto L_0x0236
        L_0x0234:
            r4 = r21
        L_0x0236:
            android.support.constraint.a.a.f[] r0 = r11.f907D
            r5 = r0[r3]
            android.support.constraint.a.a.f r5 = r5.f877d
            if (r5 == 0) goto L_0x0246
            r0 = r0[r3]
            android.support.constraint.a.a.f r0 = r0.f877d
            android.support.constraint.a.i r0 = r0.f883j
            r5 = r0
            goto L_0x0248
        L_0x0246:
            r5 = r21
        L_0x0248:
            if (r12 != r13) goto L_0x0250
            android.support.constraint.a.a.f[] r0 = r12.f907D
            r1 = r0[r39]
            r2 = r0[r3]
        L_0x0250:
            if (r4 == 0) goto L_0x049a
            if (r5 == 0) goto L_0x049a
            if (r38 != 0) goto L_0x025b
            r0 = r26
            float r0 = r0.f930aa
            goto L_0x025f
        L_0x025b:
            r0 = r26
            float r0 = r0.f932ba
        L_0x025f:
            r6 = r0
            int r3 = r1.mo1119b()
            int r7 = r2.mo1119b()
            android.support.constraint.a.i r1 = r1.f883j
            android.support.constraint.a.i r8 = r2.f883j
            r10 = 5
            r0 = r37
            r2 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r0.mo1297a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x049a
        L_0x0278:
            if (r25 == 0) goto L_0x036b
            if (r12 == 0) goto L_0x036b
            int r0 = r1.f865j
            if (r0 <= 0) goto L_0x0287
            int r1 = r1.f864i
            if (r1 != r0) goto L_0x0287
            r17 = 1
            goto L_0x0289
        L_0x0287:
            r17 = 0
        L_0x0289:
            r14 = r12
            r15 = r14
        L_0x028b:
            if (r14 == 0) goto L_0x049a
            android.support.constraint.a.a.h[] r0 = r14.f966sa
            r0 = r0[r38]
            r8 = r0
        L_0x0292:
            if (r8 == 0) goto L_0x02a1
            int r0 = r8.mo1196r()
            r7 = 8
            if (r0 != r7) goto L_0x02a3
            android.support.constraint.a.a.h[] r0 = r8.f966sa
            r8 = r0[r38]
            goto L_0x0292
        L_0x02a1:
            r7 = 8
        L_0x02a3:
            if (r8 != 0) goto L_0x02b0
            if (r14 != r13) goto L_0x02a8
            goto L_0x02b0
        L_0x02a8:
            r18 = r8
            r19 = 4
            r20 = 6
            goto L_0x035e
        L_0x02b0:
            android.support.constraint.a.a.f[] r0 = r14.f907D
            r0 = r0[r39]
            android.support.constraint.a.i r1 = r0.f883j
            android.support.constraint.a.a.f r2 = r0.f877d
            if (r2 == 0) goto L_0x02bd
            android.support.constraint.a.i r2 = r2.f883j
            goto L_0x02bf
        L_0x02bd:
            r2 = r21
        L_0x02bf:
            if (r15 == r14) goto L_0x02ca
            android.support.constraint.a.a.f[] r2 = r15.f907D
            int r3 = r39 + 1
            r2 = r2[r3]
            android.support.constraint.a.i r2 = r2.f883j
            goto L_0x02df
        L_0x02ca:
            if (r14 != r12) goto L_0x02df
            if (r15 != r14) goto L_0x02df
            android.support.constraint.a.a.f[] r2 = r10.f907D
            r3 = r2[r39]
            android.support.constraint.a.a.f r3 = r3.f877d
            if (r3 == 0) goto L_0x02dd
            r2 = r2[r39]
            android.support.constraint.a.a.f r2 = r2.f877d
            android.support.constraint.a.i r2 = r2.f883j
            goto L_0x02df
        L_0x02dd:
            r2 = r21
        L_0x02df:
            int r0 = r0.mo1119b()
            android.support.constraint.a.a.f[] r3 = r14.f907D
            int r4 = r39 + 1
            r3 = r3[r4]
            int r3 = r3.mo1119b()
            if (r8 == 0) goto L_0x02fc
            android.support.constraint.a.a.f[] r5 = r8.f907D
            r5 = r5[r39]
            android.support.constraint.a.i r6 = r5.f883j
            android.support.constraint.a.a.f[] r7 = r14.f907D
            r7 = r7[r4]
            android.support.constraint.a.i r7 = r7.f883j
            goto L_0x030f
        L_0x02fc:
            android.support.constraint.a.a.f[] r5 = r11.f907D
            r5 = r5[r4]
            android.support.constraint.a.a.f r5 = r5.f877d
            if (r5 == 0) goto L_0x0307
            android.support.constraint.a.i r6 = r5.f883j
            goto L_0x0309
        L_0x0307:
            r6 = r21
        L_0x0309:
            android.support.constraint.a.a.f[] r7 = r14.f907D
            r7 = r7[r4]
            android.support.constraint.a.i r7 = r7.f883j
        L_0x030f:
            if (r5 == 0) goto L_0x0316
            int r5 = r5.mo1119b()
            int r3 = r3 + r5
        L_0x0316:
            if (r15 == 0) goto L_0x0321
            android.support.constraint.a.a.f[] r5 = r15.f907D
            r5 = r5[r4]
            int r5 = r5.mo1119b()
            int r0 = r0 + r5
        L_0x0321:
            if (r1 == 0) goto L_0x02a8
            if (r2 == 0) goto L_0x02a8
            if (r6 == 0) goto L_0x02a8
            if (r7 == 0) goto L_0x02a8
            if (r14 != r12) goto L_0x0333
            android.support.constraint.a.a.f[] r0 = r12.f907D
            r0 = r0[r39]
            int r0 = r0.mo1119b()
        L_0x0333:
            r5 = r0
            if (r14 != r13) goto L_0x0341
            android.support.constraint.a.a.f[] r0 = r13.f907D
            r0 = r0[r4]
            int r0 = r0.mo1119b()
            r18 = r0
            goto L_0x0343
        L_0x0341:
            r18 = r3
        L_0x0343:
            if (r17 == 0) goto L_0x0348
            r22 = 6
            goto L_0x034a
        L_0x0348:
            r22 = 4
        L_0x034a:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r37
            r3 = r5
            r5 = r6
            r6 = r7
            r19 = 4
            r20 = 6
            r7 = r18
            r18 = r8
            r8 = r22
            r0.mo1297a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x035e:
            int r0 = r14.mo1196r()
            r8 = 8
            if (r0 == r8) goto L_0x0367
            r15 = r14
        L_0x0367:
            r14 = r18
            goto L_0x028b
        L_0x036b:
            r8 = 8
            r19 = 4
            r20 = 6
            if (r16 == 0) goto L_0x049a
            if (r12 == 0) goto L_0x049a
            int r0 = r1.f865j
            if (r0 <= 0) goto L_0x0380
            int r1 = r1.f864i
            if (r1 != r0) goto L_0x0380
            r17 = 1
            goto L_0x0382
        L_0x0380:
            r17 = 0
        L_0x0382:
            r14 = r12
            r15 = r14
        L_0x0384:
            if (r14 == 0) goto L_0x043c
            android.support.constraint.a.a.h[] r0 = r14.f966sa
            r0 = r0[r38]
        L_0x038a:
            if (r0 == 0) goto L_0x0397
            int r1 = r0.mo1196r()
            if (r1 != r8) goto L_0x0397
            android.support.constraint.a.a.h[] r0 = r0.f966sa
            r0 = r0[r38]
            goto L_0x038a
        L_0x0397:
            if (r14 == r12) goto L_0x0429
            if (r14 == r13) goto L_0x0429
            if (r0 == 0) goto L_0x0429
            if (r0 != r13) goto L_0x03a2
            r7 = r21
            goto L_0x03a3
        L_0x03a2:
            r7 = r0
        L_0x03a3:
            android.support.constraint.a.a.f[] r0 = r14.f907D
            r0 = r0[r39]
            android.support.constraint.a.i r1 = r0.f883j
            android.support.constraint.a.a.f r2 = r0.f877d
            if (r2 == 0) goto L_0x03af
            android.support.constraint.a.i r2 = r2.f883j
        L_0x03af:
            android.support.constraint.a.a.f[] r2 = r15.f907D
            int r3 = r39 + 1
            r2 = r2[r3]
            android.support.constraint.a.i r2 = r2.f883j
            int r0 = r0.mo1119b()
            android.support.constraint.a.a.f[] r4 = r14.f907D
            r4 = r4[r3]
            int r4 = r4.mo1119b()
            if (r7 == 0) goto L_0x03d5
            android.support.constraint.a.a.f[] r5 = r7.f907D
            r5 = r5[r39]
            android.support.constraint.a.i r6 = r5.f883j
            android.support.constraint.a.a.f r8 = r5.f877d
            if (r8 == 0) goto L_0x03d2
            android.support.constraint.a.i r8 = r8.f883j
            goto L_0x03e8
        L_0x03d2:
            r8 = r21
            goto L_0x03e8
        L_0x03d5:
            android.support.constraint.a.a.f[] r5 = r14.f907D
            r5 = r5[r3]
            android.support.constraint.a.a.f r5 = r5.f877d
            if (r5 == 0) goto L_0x03e0
            android.support.constraint.a.i r6 = r5.f883j
            goto L_0x03e2
        L_0x03e0:
            r6 = r21
        L_0x03e2:
            android.support.constraint.a.a.f[] r8 = r14.f907D
            r8 = r8[r3]
            android.support.constraint.a.i r8 = r8.f883j
        L_0x03e8:
            if (r5 == 0) goto L_0x03ef
            int r5 = r5.mo1119b()
            int r4 = r4 + r5
        L_0x03ef:
            r18 = r4
            if (r15 == 0) goto L_0x03fc
            android.support.constraint.a.a.f[] r4 = r15.f907D
            r3 = r4[r3]
            int r3 = r3.mo1119b()
            int r0 = r0 + r3
        L_0x03fc:
            r3 = r0
            if (r17 == 0) goto L_0x0402
            r22 = 6
            goto L_0x0404
        L_0x0402:
            r22 = 4
        L_0x0404:
            if (r1 == 0) goto L_0x0420
            if (r2 == 0) goto L_0x0420
            if (r6 == 0) goto L_0x0420
            if (r8 == 0) goto L_0x0420
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r37
            r5 = r6
            r6 = r8
            r23 = r7
            r7 = r18
            r18 = r15
            r15 = 8
            r8 = r22
            r0.mo1297a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0426
        L_0x0420:
            r23 = r7
            r18 = r15
            r15 = 8
        L_0x0426:
            r0 = r23
            goto L_0x042d
        L_0x0429:
            r18 = r15
            r15 = 8
        L_0x042d:
            int r1 = r14.mo1196r()
            if (r1 == r15) goto L_0x0434
            goto L_0x0436
        L_0x0434:
            r14 = r18
        L_0x0436:
            r15 = r14
            r8 = 8
            r14 = r0
            goto L_0x0384
        L_0x043c:
            android.support.constraint.a.a.f[] r0 = r12.f907D
            r0 = r0[r39]
            android.support.constraint.a.a.f[] r1 = r10.f907D
            r1 = r1[r39]
            android.support.constraint.a.a.f r1 = r1.f877d
            android.support.constraint.a.a.f[] r2 = r13.f907D
            int r3 = r39 + 1
            r10 = r2[r3]
            android.support.constraint.a.a.f[] r2 = r11.f907D
            r2 = r2[r3]
            android.support.constraint.a.a.f r14 = r2.f877d
            if (r1 == 0) goto L_0x0489
            if (r12 == r13) goto L_0x0463
            android.support.constraint.a.i r2 = r0.f883j
            android.support.constraint.a.i r1 = r1.f883j
            int r0 = r0.mo1119b()
            r15 = 5
            r9.mo1288a(r2, r1, r0, r15)
            goto L_0x048a
        L_0x0463:
            r15 = 5
            if (r14 == 0) goto L_0x048a
            android.support.constraint.a.i r2 = r0.f883j
            android.support.constraint.a.i r3 = r1.f883j
            int r4 = r0.mo1119b()
            r5 = 1056964608(0x3f000000, float:0.5)
            android.support.constraint.a.i r6 = r10.f883j
            android.support.constraint.a.i r7 = r14.f883j
            int r8 = r10.mo1119b()
            r17 = 5
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r17
            r0.mo1297a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x048a
        L_0x0489:
            r15 = 5
        L_0x048a:
            if (r14 == 0) goto L_0x049a
            if (r12 == r13) goto L_0x049a
            android.support.constraint.a.i r0 = r10.f883j
            android.support.constraint.a.i r1 = r14.f883j
            int r2 = r10.mo1119b()
            int r2 = -r2
            r9.mo1288a(r0, r1, r2, r15)
        L_0x049a:
            if (r25 != 0) goto L_0x049e
            if (r16 == 0) goto L_0x04fe
        L_0x049e:
            if (r12 == 0) goto L_0x04fe
            android.support.constraint.a.a.f[] r0 = r12.f907D
            r0 = r0[r39]
            android.support.constraint.a.a.f[] r1 = r13.f907D
            int r2 = r39 + 1
            r1 = r1[r2]
            android.support.constraint.a.a.f r3 = r0.f877d
            if (r3 == 0) goto L_0x04b1
            android.support.constraint.a.i r3 = r3.f883j
            goto L_0x04b3
        L_0x04b1:
            r3 = r21
        L_0x04b3:
            android.support.constraint.a.a.f r4 = r1.f877d
            if (r4 == 0) goto L_0x04ba
            android.support.constraint.a.i r4 = r4.f883j
            goto L_0x04bc
        L_0x04ba:
            r4 = r21
        L_0x04bc:
            if (r11 == r13) goto L_0x04cb
            android.support.constraint.a.a.f[] r4 = r11.f907D
            r4 = r4[r2]
            android.support.constraint.a.a.f r4 = r4.f877d
            if (r4 == 0) goto L_0x04c9
            android.support.constraint.a.i r4 = r4.f883j
            goto L_0x04cb
        L_0x04c9:
            r4 = r21
        L_0x04cb:
            r5 = r4
            if (r12 != r13) goto L_0x04d9
            android.support.constraint.a.a.f[] r0 = r12.f907D
            r1 = r0[r39]
            r0 = r0[r2]
            r35 = r1
            r1 = r0
            r0 = r35
        L_0x04d9:
            if (r3 == 0) goto L_0x04fe
            if (r5 == 0) goto L_0x04fe
            r4 = 1056964608(0x3f000000, float:0.5)
            int r6 = r0.mo1119b()
            if (r13 != 0) goto L_0x04e6
            goto L_0x04e7
        L_0x04e6:
            r11 = r13
        L_0x04e7:
            android.support.constraint.a.a.f[] r7 = r11.f907D
            r2 = r7[r2]
            int r7 = r2.mo1119b()
            android.support.constraint.a.i r2 = r0.f883j
            android.support.constraint.a.i r8 = r1.f883j
            r10 = 5
            r0 = r37
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.mo1297a(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x04fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p042a.p043a.C0327c.m1066a(android.support.constraint.a.a.i, android.support.constraint.a.e, int, int, android.support.constraint.a.a.d):void");
    }
}
