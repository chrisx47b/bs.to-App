package android.support.constraint.p042a;

/* renamed from: android.support.constraint.a.h */
/* compiled from: Pools */
class C0357h<T> implements C0356g<T> {

    /* renamed from: a */
    private final Object[] f1107a;

    /* renamed from: b */
    private int f1108b;

    C0357h(int i) {
        if (i > 0) {
            this.f1107a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public T mo1309a() {
        int i = this.f1108b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f1107a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f1108b = i - 1;
        return t;
    }

    /* renamed from: a */
    public boolean mo1311a(T t) {
        int i = this.f1108b;
        Object[] objArr = this.f1107a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f1108b = i + 1;
        return true;
    }

    /* renamed from: a */
    public void mo1310a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f1108b;
            Object[] objArr = this.f1107a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f1108b = i3 + 1;
            }
        }
    }
}
