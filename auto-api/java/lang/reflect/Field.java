package java.lang.reflect;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;

// import Iterator to deal with enhanced for loop translation
import java.util.Iterator;

import java.lang.annotation.Annotation;
import java.util.Comparator;
import org.apache.harmony.kernel.vm.StringUtils;
import org.apache.harmony.luni.lang.reflect.GenericSignatureParser;
import org.apache.harmony.luni.lang.reflect.Types;

public final class Field extends AccessibleObject implements Member {
    public static final Comparator<Field> ORDER_BY_NAME_AND_DECLARING_CLASS = new Comparator<Field>() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.835 -0400", hash_original_method = "5733993CE756EF2C84207962A0640F37", hash_generated_method = "F195435B882F887D24A67EDC44E22386")
        //DSFIXME:  CODE0002: Requires DSC value to be set
        @Override
        public int compare(Field a, Field b) {
            dsTaint.addTaint(b.dsTaint);
            dsTaint.addTaint(a.dsTaint);
            int comparison;
            comparison = a.name.compareTo(b.name);
            int var66A8D12774D081FD738A277749969762_760231730 = (a.getDeclaringClass().getName().compareTo(b.getDeclaringClass().getName()));
            return dsTaint.getTaintInt();
            // ---------- Original Method ----------
            //int comparison = a.name.compareTo(b.name);
            //if (comparison != 0) {
                //return comparison;
            //}
            //return a.getDeclaringClass().getName().compareTo(b.getDeclaringClass().getName());
        }

        
}; //Transformed anonymous class
    private Class<?> declaringClass;
    private Class<?> type;
    private Type genericType;
    private volatile boolean genericTypesAreInitialized = false;
    private String name;
    private int slot;
    private static final char TYPE_BOOLEAN = 'Z';
    private static final char TYPE_BYTE = 'B';
    private static final char TYPE_CHAR = 'C';
    private static final char TYPE_SHORT = 'S';
    private static final char TYPE_INTEGER = 'I';
    private static final char TYPE_FLOAT = 'F';
    private static final char TYPE_LONG = 'J';
    private static final char TYPE_DOUBLE = 'D';
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.835 -0400", hash_original_method = "18020B40E6468EB970BF7E1035466368", hash_generated_method = "1A6E243C5E577DAB2AB7DD6F1DEFD43F")
    //DSFIXME:  CODE0002: Requires DSC value to be set
     Field(Field orig) {
        this(orig.declaringClass, orig.type, orig.name, orig.slot);
        dsTaint.addTaint(orig.dsTaint);
        {
            this.flag = true;
        } //End block
        // ---------- Original Method ----------
        //if (orig.flag) {
            //this.flag = true;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.835 -0400", hash_original_method = "5600995DFD2A0F6D5A6AA1A0A4EAB766", hash_generated_method = "1B921D11ACF02340679382653279A0F6")
    @DSModeled(DSC.SAFE)
    private Field(Class<?> declaringClass, Class<?> type, String name, int slot) {
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(name);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
        // ---------- Original Method ----------
        //this.declaringClass = declaringClass;
        //this.type = type;
        //this.name = name;
        //this.slot = slot;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.836 -0400", hash_original_method = "5029B4C059F978BE158986B034FE3005", hash_generated_method = "66DF5C5F681FF947F9081122E11EFA6A")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private synchronized void initGenericType() {
        {
            String signatureAttribute;
            signatureAttribute = getSignatureAttribute();
            GenericSignatureParser parser;
            parser = new GenericSignatureParser(
                    declaringClass.getClassLoader());
            parser.parseForField(this.declaringClass, signatureAttribute);
            genericType = parser.fieldType;
            {
                genericType = getType();
            } //End block
            genericTypesAreInitialized = true;
        } //End block
        // ---------- Original Method ----------
        //if (!genericTypesAreInitialized) {
            //String signatureAttribute = getSignatureAttribute();
            //GenericSignatureParser parser = new GenericSignatureParser(
                    //declaringClass.getClassLoader());
            //parser.parseForField(this.declaringClass, signatureAttribute);
            //genericType = parser.fieldType;
            //if (genericType == null) {
                //genericType = getType();
            //}
            //genericTypesAreInitialized = true;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.836 -0400", hash_original_method = "1CDF5107AC443AA5F8C2E1DA9DF559A0", hash_generated_method = "F6D0E342901BC7FC182846D9B465C8B0")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    @Override
     String getSignatureAttribute() {
        Object[] annotation;
        annotation = getSignatureAnnotation(declaringClass, slot);
        String var33705CFE2485E284459211E6CFE410F3_970655916 = (StringUtils.combineStrings(annotation));
        return dsTaint.getTaintString();
        // ---------- Original Method ----------
        //Object[] annotation = getSignatureAnnotation(declaringClass, slot);
        //if (annotation == null) {
            //return null;
        //}
        //return StringUtils.combineStrings(annotation);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.836 -0400", hash_original_method = "5161131687230E0D7EE89383FDDF9117", hash_generated_method = "B41796EE9EFF5108A474A54139222209")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private Object[] getSignatureAnnotation(Class declaringClass, int slot) {
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.836 -0400", hash_original_method = "FC3424D2079ACBF27BEC7269ECB48C94", hash_generated_method = "10DFC528F44F099626B3F4EF947A1077")
    @DSModeled(DSC.SAFE)
    public boolean isSynthetic() {
        int flags;
        flags = getFieldModifiers(declaringClass, slot);
        return dsTaint.getTaintBoolean();
        // ---------- Original Method ----------
        //int flags = getFieldModifiers(declaringClass, slot);
        //return (flags & Modifier.SYNTHETIC) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.836 -0400", hash_original_method = "E96960960A41CE3DD754F7ED4B73683A", hash_generated_method = "0C869B7E6D57D481190A82BB6BE6A17D")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public String toGenericString() {
        StringBuilder sb;
        sb = new StringBuilder(80);
        int modifier;
        modifier = getModifiers();
        {
            sb.append(Modifier.toString(modifier)).append(' ');
        } //End block
        appendGenericType(sb, getGenericType());
        sb.append(' ');
        sb.append(getDeclaringClass().getName()).append('.').append(getName());
        String var806458D832AB974D230FEE4CBBDBD390_2077166365 = (sb.toString());
        return dsTaint.getTaintString();
        // ---------- Original Method ----------
        //StringBuilder sb = new StringBuilder(80);
        //int modifier = getModifiers();
        //if (modifier != 0) {
            //sb.append(Modifier.toString(modifier)).append(' ');
        //}
        //appendGenericType(sb, getGenericType());
        //sb.append(' ');
        //sb.append(getDeclaringClass().getName()).append('.').append(getName());
        //return sb.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.836 -0400", hash_original_method = "2827C86400F787FBBD0EA58BB5706D02", hash_generated_method = "4CF24BE6CD86DADFBDAB3563A24C8CDB")
    @DSModeled(DSC.SAFE)
    public boolean isEnumConstant() {
        int flags;
        flags = getFieldModifiers(declaringClass, slot);
        return dsTaint.getTaintBoolean();
        // ---------- Original Method ----------
        //int flags = getFieldModifiers(declaringClass, slot);
        //return (flags & Modifier.ENUM) != 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.836 -0400", hash_original_method = "963F10B2A4697E7A9ECC1BB94066D74F", hash_generated_method = "EFD9D05F79402848DF2A9095C38A166B")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public Type getGenericType() {
        initGenericType();
        Type var170E1EA7DEAB06104AE30D989C517A53_467587737 = (Types.getType(genericType));
        return (Type)dsTaint.getTaint();
        // ---------- Original Method ----------
        //initGenericType();
        //return Types.getType(genericType);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.836 -0400", hash_original_method = "4122EC91CDDE6FFD9DA08F5ADAF8DB5D", hash_generated_method = "B6E9B21DC483BBD062F7799311295BD0")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    @Override
    public Annotation[] getDeclaredAnnotations() {
        Annotation[] varC17A9D109C2F23B123FCE14BCDF22667_959350598 = (getDeclaredAnnotations(declaringClass, slot));
        return (Annotation[])dsTaint.getTaint();
        // ---------- Original Method ----------
        //return getDeclaredAnnotations(declaringClass, slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.836 -0400", hash_original_method = "3643C5C7AF3E1CB3C9A364BCB2E04542", hash_generated_method = "EDAA01609EF32978192CC6B849E81AE2")
    private static Annotation[] getDeclaredAnnotations(Class declaringClass, int slot) {
        //DSFIXME:  CODE0012: Native static method requires manual modeling
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.836 -0400", hash_original_method = "C04F97610183E33B13FB9B4273375B6D", hash_generated_method = "23219FFE36AF134B8D41F171B41C1BBE")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    @Override
    public <A extends Annotation> A getAnnotation(Class<A> annotationType) {
        dsTaint.addTaint(annotationType.dsTaint);
        {
            throw new NullPointerException("annotationType == null");
        } //End block
        A var5916D8A05D9FACE17C9DF14466E6D186_2073826313 = (getAnnotation(declaringClass, slot, annotationType));
        return (A)dsTaint.getTaint();
        // ---------- Original Method ----------
        //if (annotationType == null) {
            //throw new NullPointerException("annotationType == null");
        //}
        //return getAnnotation(declaringClass, slot, annotationType);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.836 -0400", hash_original_method = "C4BBAD45B2B34A1D1F18CA240E0A5303", hash_generated_method = "A011795895B7724F33B4F2132ECCE669")
    private static <A extends Annotation> A getAnnotation(
            Class<?> declaringClass, int slot, Class<A> annotationType) {
        //DSFIXME:  CODE0012: Native static method requires manual modeling
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.836 -0400", hash_original_method = "D8B142EB73E138FF5927E6AE1DAD56D2", hash_generated_method = "3DBA50BFF4AE85B96E360074ED22BD61")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    @Override
    public boolean isAnnotationPresent(Class<? extends Annotation> annotationType) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        dsTaint.addTaint(annotationType.dsTaint);
        {
            throw new NullPointerException("annotationType == null");
        } //End block
        boolean varB3780DB5BBCCEE48C62CDF997A07D42D_1626624089 = (isAnnotationPresent(declaringClass, slot, annotationType));
        return dsTaint.getTaintBoolean();
        // ---------- Original Method ----------
        //if (annotationType == null) {
            //throw new NullPointerException("annotationType == null");
        //}
        //return isAnnotationPresent(declaringClass, slot, annotationType);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.836 -0400", hash_original_method = "B27804BB128191FC86404E3EF5E631CD", hash_generated_method = "457E6138C66DEC7B135DFEB2C9EDD23A")
    private static boolean isAnnotationPresent(
            Class<?> declaringClass, int slot, Class<? extends Annotation> annotationType) {
        //DSFIXME:  CODE0012: Native static method requires manual modeling
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.836 -0400", hash_original_method = "955F27DFEC9F7B5FBB7D8BD5BE41A050", hash_generated_method = "6AEDCACC6711D400118E20F9146E8084")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    @Override
    public boolean equals(Object object) {
        dsTaint.addTaint(object.dsTaint);
        boolean varDCACFE8832290BDBC09105E7C6859538_90417228 = (object instanceof Field && toString().equals(object.toString()));
        return dsTaint.getTaintBoolean();
        // ---------- Original Method ----------
        //return object instanceof Field && toString().equals(object.toString());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.836 -0400", hash_original_method = "7AE3BC00249CC99885BB0445C93FB18A", hash_generated_method = "F1AE2C8A89DC415D4CD37C6BCF470C2E")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public Object get(Object object) throws IllegalAccessException, IllegalArgumentException {
        dsTaint.addTaint(object.dsTaint);
        Object varD28C1EFCF24C94C02D24865CE6F475EE_2034356008 = (getField(object, declaringClass, type, slot, flag));
        return (Object)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return getField(object, declaringClass, type, slot, flag);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "27492232D5FCC61236B83BF948F6F104", hash_generated_method = "27A2D95503754CEF30AEBD22E2D1FD73")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public boolean getBoolean(Object object) throws IllegalAccessException,
            IllegalArgumentException {
        dsTaint.addTaint(object.dsTaint);
        boolean var9DA284626B9970789966B6A4F6E5FB32_2132128994 = (getZField(object, declaringClass, type, slot, flag, TYPE_BOOLEAN));
        return dsTaint.getTaintBoolean();
        // ---------- Original Method ----------
        //return getZField(object, declaringClass, type, slot, flag, TYPE_BOOLEAN);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "638C7C4918F4FDF5130555C74F583890", hash_generated_method = "65CA57071CD832EBF6A3B2488A7F6EAF")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public byte getByte(Object object) throws IllegalAccessException, IllegalArgumentException {
        dsTaint.addTaint(object.dsTaint);
        byte varA215D52F81AAE6605102E4D98BCBBCB4_1091151885 = (getBField(object, declaringClass, type, slot, flag, TYPE_BYTE));
        return dsTaint.getTaintByte();
        // ---------- Original Method ----------
        //return getBField(object, declaringClass, type, slot, flag, TYPE_BYTE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "6648A25494EBFE26376F66DF9331BADB", hash_generated_method = "AFBDB06A195FB4E2E5337DDA903035A8")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public char getChar(Object object) throws IllegalAccessException, IllegalArgumentException {
        dsTaint.addTaint(object.dsTaint);
        char var955F981595FD17AB1396A3EADA1E0C15_425384685 = (getCField(object, declaringClass, type, slot, flag, TYPE_CHAR));
        return dsTaint.getTaintChar();
        // ---------- Original Method ----------
        //return getCField(object, declaringClass, type, slot, flag, TYPE_CHAR);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "747BEFE9985C4AF4EE3D5630B62185EA", hash_generated_method = "99880D4E2F357F2473F072C752026276")
    @DSModeled(DSC.SAFE)
    public Class<?> getDeclaringClass() {
        return (Class<?>)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return declaringClass;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "B22A8667913C0820CACD3D8F78E3B803", hash_generated_method = "78A58C337031F37AE605D53115EBFFC7")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public double getDouble(Object object) throws IllegalAccessException, IllegalArgumentException {
        dsTaint.addTaint(object.dsTaint);
        double varAE2581BDD0AD43AE217DFFB84BBB208E_916410058 = (getDField(object, declaringClass, type, slot, flag, TYPE_DOUBLE));
        return dsTaint.getTaintDouble();
        // ---------- Original Method ----------
        //return getDField(object, declaringClass, type, slot, flag, TYPE_DOUBLE);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "BFF553DA1989441891013747E355F341", hash_generated_method = "8AE04D4375715CD319213377749B1B31")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public float getFloat(Object object) throws IllegalAccessException, IllegalArgumentException {
        dsTaint.addTaint(object.dsTaint);
        float var1A5038016F232945D7BD627195B26E7D_1340313782 = (getFField(object, declaringClass, type, slot, flag, TYPE_FLOAT));
        return dsTaint.getTaintFloat();
        // ---------- Original Method ----------
        //return getFField(object, declaringClass, type, slot, flag, TYPE_FLOAT);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "5CB83BC53ADA020FA0FD37C15AAD9E62", hash_generated_method = "A4B9E8771BDAF2E849B1FC0FC55D681A")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public int getInt(Object object) throws IllegalAccessException, IllegalArgumentException {
        dsTaint.addTaint(object.dsTaint);
        int var5F795D86675AD53A1B7ACF3414BE7AF6_1488057560 = (getIField(object, declaringClass, type, slot, flag, TYPE_INTEGER));
        return dsTaint.getTaintInt();
        // ---------- Original Method ----------
        //return getIField(object, declaringClass, type, slot, flag, TYPE_INTEGER);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "005A2557A921AA55BF8BDBCBDC639BE4", hash_generated_method = "24F3932C0C3B0B64C599FB334F6FAE5E")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public long getLong(Object object) throws IllegalAccessException, IllegalArgumentException {
        dsTaint.addTaint(object.dsTaint);
        long var250CDA2AC47DDC6DF64D4C553373D869_1905416794 = (getJField(object, declaringClass, type, slot, flag, TYPE_LONG));
        return dsTaint.getTaintLong();
        // ---------- Original Method ----------
        //return getJField(object, declaringClass, type, slot, flag, TYPE_LONG);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "5A676A538E8952F6729F0D8423178A33", hash_generated_method = "DD4641CF2D041F0FE02CDCFFBEFFF7E3")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public int getModifiers() {
        int var49B847D353C589D7A33E0861E95832A8_1870014806 = (getFieldModifiers(declaringClass, slot));
        return dsTaint.getTaintInt();
        // ---------- Original Method ----------
        //return getFieldModifiers(declaringClass, slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "9D513D500FBFD57DB21A924D9A85826A", hash_generated_method = "57F9A5B46738BAB02D4321B1827463A6")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private int getFieldModifiers(Class<?> declaringClass, int slot) {
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "7070E6AABEDCBA653834DDC8CF79A47C", hash_generated_method = "F47755EA38582EE7C3877DD72123E9B0")
    @DSModeled(DSC.SAFE)
    public String getName() {
        return dsTaint.getTaintString();
        // ---------- Original Method ----------
        //return name;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "0DDA5605A2464ED398902817D939E3F2", hash_generated_method = "49C282B00E025B9DCF45F6B931369213")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public short getShort(Object object) throws IllegalAccessException, IllegalArgumentException {
        dsTaint.addTaint(object.dsTaint);
        short var71629059FF106ED311F07E4A99F9E53D_482576539 = (getSField(object, declaringClass, type, slot, flag, TYPE_SHORT));
        return dsTaint.getTaintShort();
        // ---------- Original Method ----------
        //return getSField(object, declaringClass, type, slot, flag, TYPE_SHORT);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "994767CE6492BCD5B50ECB089389E539", hash_generated_method = "A7CE9B4AC9BB283211E5A76D93E26B1C")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    @SuppressWarnings("unused")
    private String getSignature() {
        String var5FC76005A19E0B56E0F03F4B344A7764_1487712518 = (getSignature(type));
        return dsTaint.getTaintString();
        // ---------- Original Method ----------
        //return getSignature(type);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "21C93A7CC51FD6114C8D944747F943F4", hash_generated_method = "5E75BCE8A974E09D8788BB6771AC21CE")
    @DSModeled(DSC.SAFE)
    public Class<?> getType() {
        return (Class<?>)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return type;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "7C0B16AD34D2790FBD73D96D003DD91D", hash_generated_method = "FE543E86ED02F34950362A719DA1E978")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    @Override
    public int hashCode() {
        int varFE991B9610FD8386F23C23BA9DCC53AC_1200433179 = (name.hashCode() ^ getDeclaringClass().getName().hashCode());
        return dsTaint.getTaintInt();
        // ---------- Original Method ----------
        //return name.hashCode() ^ getDeclaringClass().getName().hashCode();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "6D24AA0F6B01F01D922DBBA93FD91F81", hash_generated_method = "8D1CBAA5FBDB7BA0E86008CD352CB21B")
    @DSModeled(DSC.SAFE)
    public void set(Object object, Object value) throws IllegalAccessException,
            IllegalArgumentException {
        dsTaint.addTaint(value.dsTaint);
        dsTaint.addTaint(object.dsTaint);
        setField(object, declaringClass, type, slot, flag, value);
        // ---------- Original Method ----------
        //setField(object, declaringClass, type, slot, flag, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "25FFB4639E444F2A9FD12AF0E909B7A5", hash_generated_method = "DFD9D79D7258DD4CA3276E98548F7EBB")
    @DSModeled(DSC.SAFE)
    public void setBoolean(Object object, boolean value) throws IllegalAccessException,
            IllegalArgumentException {
        dsTaint.addTaint(value);
        dsTaint.addTaint(object.dsTaint);
        setZField(object, declaringClass, type, slot, flag, TYPE_BOOLEAN, value);
        // ---------- Original Method ----------
        //setZField(object, declaringClass, type, slot, flag, TYPE_BOOLEAN, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.837 -0400", hash_original_method = "AD912B9A4F5D11756FF2F9AE3FC4D6E6", hash_generated_method = "9648E2CB9F82B7008762D8F9976A35E2")
    @DSModeled(DSC.SAFE)
    public void setByte(Object object, byte value) throws IllegalAccessException,
            IllegalArgumentException {
        dsTaint.addTaint(value);
        dsTaint.addTaint(object.dsTaint);
        setBField(object, declaringClass, type, slot, flag, TYPE_BYTE, value);
        // ---------- Original Method ----------
        //setBField(object, declaringClass, type, slot, flag, TYPE_BYTE, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "97D79EA86FEBB11A4E8B5CD3EFF3DEF5", hash_generated_method = "98E3BA90FDAF57283C409C748BF054B9")
    @DSModeled(DSC.SAFE)
    public void setChar(Object object, char value) throws IllegalAccessException,
            IllegalArgumentException {
        dsTaint.addTaint(value);
        dsTaint.addTaint(object.dsTaint);
        setCField(object, declaringClass, type, slot, flag, TYPE_CHAR, value);
        // ---------- Original Method ----------
        //setCField(object, declaringClass, type, slot, flag, TYPE_CHAR, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "5E12E36ACBA66ADB7DF4FF63170F60C3", hash_generated_method = "3475C86CBC63BF707C1B28E8C4C00E36")
    @DSModeled(DSC.SAFE)
    public void setDouble(Object object, double value) throws IllegalAccessException,
            IllegalArgumentException {
        dsTaint.addTaint(value);
        dsTaint.addTaint(object.dsTaint);
        setDField(object, declaringClass, type, slot, flag, TYPE_DOUBLE, value);
        // ---------- Original Method ----------
        //setDField(object, declaringClass, type, slot, flag, TYPE_DOUBLE, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "4860783C5B567E2FC646E7FC5AE81E3C", hash_generated_method = "9F23B8866AB3B5034FD704F801F1F51B")
    @DSModeled(DSC.SAFE)
    public void setFloat(Object object, float value) throws IllegalAccessException,
            IllegalArgumentException {
        dsTaint.addTaint(value);
        dsTaint.addTaint(object.dsTaint);
        setFField(object, declaringClass, type, slot, flag, TYPE_FLOAT, value);
        // ---------- Original Method ----------
        //setFField(object, declaringClass, type, slot, flag, TYPE_FLOAT, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "DA13B1330D08A636280F51E51FF711B2", hash_generated_method = "3BECA27F369D658BD327D32D872486BB")
    @DSModeled(DSC.SAFE)
    public void setInt(Object object, int value) throws IllegalAccessException,
            IllegalArgumentException {
        dsTaint.addTaint(value);
        dsTaint.addTaint(object.dsTaint);
        setIField(object, declaringClass, type, slot, flag, TYPE_INTEGER, value);
        // ---------- Original Method ----------
        //setIField(object, declaringClass, type, slot, flag, TYPE_INTEGER, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "F703AA23CA1EF460C68B245887B2C6B7", hash_generated_method = "622B082EBEF78243FB022A304DD37896")
    @DSModeled(DSC.SAFE)
    public void setLong(Object object, long value) throws IllegalAccessException,
            IllegalArgumentException {
        dsTaint.addTaint(value);
        dsTaint.addTaint(object.dsTaint);
        setJField(object, declaringClass, type, slot, flag, TYPE_LONG, value);
        // ---------- Original Method ----------
        //setJField(object, declaringClass, type, slot, flag, TYPE_LONG, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "DEE843BD220F8992FC80A23844FC7C06", hash_generated_method = "AA98D723FEA0811CA6E3C7CCCD34D393")
    @DSModeled(DSC.SAFE)
    public void setShort(Object object, short value) throws IllegalAccessException,
            IllegalArgumentException {
        dsTaint.addTaint(value);
        dsTaint.addTaint(object.dsTaint);
        setSField(object, declaringClass, type, slot, flag, TYPE_SHORT, value);
        // ---------- Original Method ----------
        //setSField(object, declaringClass, type, slot, flag, TYPE_SHORT, value);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "2B14553F8A926216EE23C791DBC737FD", hash_generated_method = "3A926A46FC4EAF251CDD04201A5A2557")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    @Override
    public String toString() {
        StringBuilder result;
        result = new StringBuilder(Modifier.toString(getModifiers()));
        {
            boolean varFD23457D7925EE9ADC9C1D678FE17210_1067629415 = (result.length() != 0);
            {
                result.append(' ');
            } //End block
        } //End collapsed parenthetic
        appendArrayType(result, type);
        result.append(' ');
        result.append(declaringClass.getName());
        result.append('.');
        result.append(name);
        String varEA70154FDA28CC59402440C6317B57EF_681919024 = (result.toString());
        return dsTaint.getTaintString();
        // ---------- Original Method ----------
        //StringBuilder result = new StringBuilder(Modifier.toString(getModifiers()));
        //if (result.length() != 0) {
            //result.append(' ');
        //}
        //appendArrayType(result, type);
        //result.append(' ');
        //result.append(declaringClass.getName());
        //result.append('.');
        //result.append(name);
        //return result.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "2E771D0497C584665EAFE5039BCB9B58", hash_generated_method = "D0B6A16CD9969B07F44C206490B4FFA7")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private Object getField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "E4CBB65FF20F2B42AAAA5852C9FC84C9", hash_generated_method = "ABD10B62F3F63C2AD85A1515925DE944")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private double getDField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, char descriptor) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(descriptor);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "9B86AA05444EF83A8159E0D0E3B46582", hash_generated_method = "4AFDFD68D8DD672F4D1DC317DD1399D7")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private int getIField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, char descriptor) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(descriptor);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "1F116F930DBB16C5DB58ABA31954B7AA", hash_generated_method = "655BDF9E039BB8EB863AA44DEC6A6EF8")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private long getJField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, char descriptor) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(descriptor);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "50BE3A9E4BA3ACB6450AF3382B17C97D", hash_generated_method = "40B22BCF9FC0B6580D67C2BB609A8390")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private boolean getZField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, char descriptor) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(descriptor);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "94E059571B5D65D86B6231E7D36BF7FA", hash_generated_method = "7C79547C5C7D9F0B4F655FE94F32F72A")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private float getFField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, char descriptor) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(descriptor);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "9A55E198BD753BB34F159FBC2807D96E", hash_generated_method = "02E34E769541BD5A6B1BD7A8EF365992")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private char getCField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, char descriptor) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(descriptor);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "9FE268B454DA8902066BFF2BFC132935", hash_generated_method = "EF97D4A17F9F81D3E135452C20B84DBF")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private short getSField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, char descriptor) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(descriptor);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "B020FC56F3182544B11E7C259C9C5B21", hash_generated_method = "B9CF31B4EA4E225527E8CABF05A709D1")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private byte getBField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, char descriptor) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(descriptor);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "D9AA799947323C8F653B1139DF380855", hash_generated_method = "47B33885FD2EBF25F8E0595CDB7B432B")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private void setField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, Object value) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(value.dsTaint);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "3CCE00B68111CAA3AA20979F21B904D8", hash_generated_method = "83001205EA35EE3752D52C584579FF38")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private void setDField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, char descriptor, double v) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(v);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(descriptor);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "32CBAB454E52D8BFC71D6AB87E7BF1FE", hash_generated_method = "51C1C5C409E67DF15264E7325C9627F6")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private void setIField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, char descriptor, int i) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(descriptor);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
        dsTaint.addTaint(i);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.838 -0400", hash_original_method = "7CE46D8AB646DF2CA9A88ACDCE998029", hash_generated_method = "C0691878EC0E75EED143AF34054DD842")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private void setJField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, char descriptor, long j) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(descriptor);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
        dsTaint.addTaint(j);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.839 -0400", hash_original_method = "E80188BF0543922F0F2BDA0A103D17F5", hash_generated_method = "287A11F4A3DC7F4AEAEFCC8BDCA731BD")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private void setZField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, char descriptor, boolean z) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(descriptor);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
        dsTaint.addTaint(z);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.839 -0400", hash_original_method = "570BC71D32CB4741615EF7701079ED2D", hash_generated_method = "A8AB8DE52B3242B12874E3373F14262C")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private void setFField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, char descriptor, float f) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(f);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(descriptor);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.839 -0400", hash_original_method = "ACD0A6EABB934CC5EEECCAB72AA01730", hash_generated_method = "3A861E75875C8F94784B97F3EB9A71F7")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private void setCField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, char descriptor, char c) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(descriptor);
        dsTaint.addTaint(c);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.839 -0400", hash_original_method = "2A0F6C37A6B68BD24BAC15A31879F06F", hash_generated_method = "729A84D7E6FF2733D7CC81CA51A0DEBF")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private void setSField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, char descriptor, short s) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(s);
        dsTaint.addTaint(descriptor);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.839 -0400", hash_original_method = "4D8B3646C0E699793861ED8487ADC739", hash_generated_method = "35FC1A7F36425F7FA4E0E7898F75E9BB")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    private void setBField(Object o, Class<?> declaringClass, Class<?> type, int slot,
            boolean noAccessCheck, char descriptor, byte b) throws IllegalAccessException {
        dsTaint.addTaint(noAccessCheck);
        dsTaint.addTaint(declaringClass.dsTaint);
        dsTaint.addTaint(b);
        dsTaint.addTaint(descriptor);
        dsTaint.addTaint(o.dsTaint);
        dsTaint.addTaint(type.dsTaint);
        dsTaint.addTaint(slot);
    }

    
}


