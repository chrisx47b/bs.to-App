package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p216me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: android.arch.lifecycle.j */
/* compiled from: Lifecycling */
public class C0308j {

    /* renamed from: a */
    private static Map<Class, Integer> f745a = new HashMap();

    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends C0298c>>> f746b = new HashMap();

    /* renamed from: a */
    static GenericLifecycleObserver m992a(Object obj) {
        if (obj instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj);
        }
        if (obj instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) obj;
        }
        Class cls = obj.getClass();
        if (m996b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f746b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m993a((Constructor) list.get(0), obj));
        }
        C0298c[] cVarArr = new C0298c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cVarArr[i] = m993a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    /* renamed from: b */
    private static int m996b(Class<?> cls) {
        if (f745a.containsKey(cls)) {
            return ((Integer) f745a.get(cls)).intValue();
        }
        int d = m998d(cls);
        f745a.put(cls, Integer.valueOf(d));
        return d;
    }

    /* renamed from: c */
    private static boolean m997c(Class<?> cls) {
        return cls != null && C0302e.class.isAssignableFrom(cls);
    }

    /* renamed from: d */
    private static int m998d(Class<?> cls) {
        Class[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor a = m995a(cls);
        if (a != null) {
            f746b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C0294a.f720a.mo1021b(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m997c(superclass)) {
                if (m996b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList((Collection) f746b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m997c(cls2)) {
                    if (m996b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll((Collection) f746b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f746b.put(cls, arrayList);
            return 2;
        }
    }

    /* renamed from: a */
    private static C0298c m993a(Constructor<? extends C0298c> constructor, Object obj) {
        try {
            return (C0298c) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    private static Constructor<? extends C0298c> m995a(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : BuildConfig.FLAVOR;
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String a = m994a(canonicalName);
            if (!name.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(".");
                sb.append(a);
                a = sb.toString();
            }
            Constructor<? extends C0298c> declaredConstructor = Class.forName(a).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static String m994a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(".", "_"));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }
}
