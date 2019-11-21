package android.arch.lifecycle;

import android.arch.lifecycle.C0299d.C0300a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.a */
/* compiled from: ClassesInfoCache */
class C0294a {

    /* renamed from: a */
    static C0294a f720a = new C0294a();

    /* renamed from: b */
    private final Map<Class, C0295a> f721b = new HashMap();

    /* renamed from: c */
    private final Map<Class, Boolean> f722c = new HashMap();

    /* renamed from: android.arch.lifecycle.a$a */
    /* compiled from: ClassesInfoCache */
    static class C0295a {

        /* renamed from: a */
        final Map<C0300a, List<C0296b>> f723a = new HashMap();

        /* renamed from: b */
        final Map<C0296b, C0300a> f724b;

        C0295a(Map<C0296b, C0300a> map) {
            this.f724b = map;
            for (Entry entry : map.entrySet()) {
                C0300a aVar = (C0300a) entry.getValue();
                List list = (List) this.f723a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f723a.put(aVar, list);
                }
                list.add(entry.getKey());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1022a(C0303f fVar, C0300a aVar, Object obj) {
            m964a((List) this.f723a.get(aVar), fVar, aVar, obj);
            m964a((List) this.f723a.get(C0300a.ON_ANY), fVar, aVar, obj);
        }

        /* renamed from: a */
        private static void m964a(List<C0296b> list, C0303f fVar, C0300a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0296b) list.get(size)).mo1023a(fVar, aVar, obj);
                }
            }
        }
    }

    /* renamed from: android.arch.lifecycle.a$b */
    /* compiled from: ClassesInfoCache */
    static class C0296b {

        /* renamed from: a */
        final int f725a;

        /* renamed from: b */
        final Method f726b;

        C0296b(int i, Method method) {
            this.f725a = i;
            this.f726b = method;
            this.f726b.setAccessible(true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1023a(C0303f fVar, C0300a aVar, Object obj) {
            try {
                int i = this.f725a;
                if (i == 0) {
                    this.f726b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f726b.invoke(obj, new Object[]{fVar});
                } else if (i == 2) {
                    this.f726b.invoke(obj, new Object[]{fVar, aVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C0296b.class != obj.getClass()) {
                return false;
            }
            C0296b bVar = (C0296b) obj;
            if (this.f725a != bVar.f725a || !this.f726b.getName().equals(bVar.f726b.getName())) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.f725a * 31) + this.f726b.getName().hashCode();
        }
    }

    C0294a() {
    }

    /* renamed from: c */
    private Method[] m961c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0295a mo1020a(Class cls) {
        C0295a aVar = (C0295a) this.f721b.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m959a(cls, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo1021b(Class cls) {
        if (this.f722c.containsKey(cls)) {
            return ((Boolean) this.f722c.get(cls)).booleanValue();
        }
        Method[] c = m961c(cls);
        for (Method annotation : c) {
            if (((C0313o) annotation.getAnnotation(C0313o.class)) != null) {
                m959a(cls, c);
                return true;
            }
        }
        this.f722c.put(cls, Boolean.valueOf(false));
        return false;
    }

    /* renamed from: a */
    private void m960a(Map<C0296b, C0300a> map, C0296b bVar, C0300a aVar, Class cls) {
        C0300a aVar2 = (C0300a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f726b;
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(aVar2);
            sb.append(", new value ");
            sb.append(aVar);
            throw new IllegalArgumentException(sb.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* renamed from: a */
    private C0295a m959a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C0295a a = mo1020a(superclass);
            if (a != null) {
                hashMap.putAll(a.f724b);
            }
        }
        for (Class a2 : cls.getInterfaces()) {
            for (Entry entry : mo1020a(a2).f724b.entrySet()) {
                m960a(hashMap, (C0296b) entry.getKey(), (C0300a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m961c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0313o oVar = (C0313o) method.getAnnotation(C0313o.class);
            if (oVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0303f.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0300a value = oVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0300a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0300a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m960a(hashMap, new C0296b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0295a aVar = new C0295a(hashMap);
        this.f721b.put(cls, aVar);
        this.f722c.put(cls, Boolean.valueOf(z));
        return aVar;
    }
}
