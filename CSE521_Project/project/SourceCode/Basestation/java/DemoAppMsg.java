/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'DemoAppMsg'
 * message type.
 */

public class DemoAppMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 9;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 150;

    /** Create a new DemoAppMsg of size 9. */
    public DemoAppMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new DemoAppMsg of the given data_length. */
    public DemoAppMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DemoAppMsg with the given data_length
     * and base offset.
     */
    public DemoAppMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DemoAppMsg using the given byte array
     * as backing store.
     */
    public DemoAppMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DemoAppMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public DemoAppMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DemoAppMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public DemoAppMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DemoAppMsg embedded in the given message
     * at the given base offset.
     */
    public DemoAppMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new DemoAppMsg embedded in the given message
     * at the given base offset and length.
     */
    public DemoAppMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <DemoAppMsg> \n";
      try {
        s += "  [moteId=0x"+Long.toHexString(get_moteId())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [photoReading=0x"+Long.toHexString(get_photoReading())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [tempReading=0x"+Long.toHexString(get_tempReading())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [humidityReading=0x"+Long.toHexString(get_humidityReading())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [internalTempReading=0x"+Long.toHexString(get_internalTempReading())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: moteId
    //   Field type: byte, unsigned
    //   Offset (bits): 0
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'moteId' is signed (false).
     */
    public static boolean isSigned_moteId() {
        return false;
    }

    /**
     * Return whether the field 'moteId' is an array (false).
     */
    public static boolean isArray_moteId() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'moteId'
     */
    public static int offset_moteId() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'moteId'
     */
    public static int offsetBits_moteId() {
        return 0;
    }

    /**
     * Return the value (as a byte) of the field 'moteId'
     */
    public byte get_moteId() {
        return (byte)getSIntBEElement(offsetBits_moteId(), 8);
    }

    /**
     * Set the value of the field 'moteId'
     */
    public void set_moteId(byte value) {
        setSIntBEElement(offsetBits_moteId(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'moteId'
     */
    public static int size_moteId() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'moteId'
     */
    public static int sizeBits_moteId() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: photoReading
    //   Field type: int, unsigned
    //   Offset (bits): 8
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'photoReading' is signed (false).
     */
    public static boolean isSigned_photoReading() {
        return false;
    }

    /**
     * Return whether the field 'photoReading' is an array (false).
     */
    public static boolean isArray_photoReading() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'photoReading'
     */
    public static int offset_photoReading() {
        return (8 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'photoReading'
     */
    public static int offsetBits_photoReading() {
        return 8;
    }

    /**
     * Return the value (as a int) of the field 'photoReading'
     */
    public int get_photoReading() {
        return (int)getUIntBEElement(offsetBits_photoReading(), 16);
    }

    /**
     * Set the value of the field 'photoReading'
     */
    public void set_photoReading(int value) {
        setUIntBEElement(offsetBits_photoReading(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'photoReading'
     */
    public static int size_photoReading() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'photoReading'
     */
    public static int sizeBits_photoReading() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: tempReading
    //   Field type: int, unsigned
    //   Offset (bits): 24
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'tempReading' is signed (false).
     */
    public static boolean isSigned_tempReading() {
        return false;
    }

    /**
     * Return whether the field 'tempReading' is an array (false).
     */
    public static boolean isArray_tempReading() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'tempReading'
     */
    public static int offset_tempReading() {
        return (24 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'tempReading'
     */
    public static int offsetBits_tempReading() {
        return 24;
    }

    /**
     * Return the value (as a int) of the field 'tempReading'
     */
    public int get_tempReading() {
        return (int)getUIntBEElement(offsetBits_tempReading(), 16);
    }

    /**
     * Set the value of the field 'tempReading'
     */
    public void set_tempReading(int value) {
        setUIntBEElement(offsetBits_tempReading(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'tempReading'
     */
    public static int size_tempReading() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'tempReading'
     */
    public static int sizeBits_tempReading() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: humidityReading
    //   Field type: int, unsigned
    //   Offset (bits): 40
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'humidityReading' is signed (false).
     */
    public static boolean isSigned_humidityReading() {
        return false;
    }

    /**
     * Return whether the field 'humidityReading' is an array (false).
     */
    public static boolean isArray_humidityReading() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'humidityReading'
     */
    public static int offset_humidityReading() {
        return (40 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'humidityReading'
     */
    public static int offsetBits_humidityReading() {
        return 40;
    }

    /**
     * Return the value (as a int) of the field 'humidityReading'
     */
    public int get_humidityReading() {
        return (int)getUIntBEElement(offsetBits_humidityReading(), 16);
    }

    /**
     * Set the value of the field 'humidityReading'
     */
    public void set_humidityReading(int value) {
        setUIntBEElement(offsetBits_humidityReading(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'humidityReading'
     */
    public static int size_humidityReading() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'humidityReading'
     */
    public static int sizeBits_humidityReading() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: internalTempReading
    //   Field type: int, unsigned
    //   Offset (bits): 56
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'internalTempReading' is signed (false).
     */
    public static boolean isSigned_internalTempReading() {
        return false;
    }

    /**
     * Return whether the field 'internalTempReading' is an array (false).
     */
    public static boolean isArray_internalTempReading() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'internalTempReading'
     */
    public static int offset_internalTempReading() {
        return (56 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'internalTempReading'
     */
    public static int offsetBits_internalTempReading() {
        return 56;
    }

    /**
     * Return the value (as a int) of the field 'internalTempReading'
     */
    public int get_internalTempReading() {
        return (int)getUIntBEElement(offsetBits_internalTempReading(), 16);
    }

    /**
     * Set the value of the field 'internalTempReading'
     */
    public void set_internalTempReading(int value) {
        setUIntBEElement(offsetBits_internalTempReading(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'internalTempReading'
     */
    public static int size_internalTempReading() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'internalTempReading'
     */
    public static int sizeBits_internalTempReading() {
        return 16;
    }

}
