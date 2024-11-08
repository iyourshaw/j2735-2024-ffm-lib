// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct OperatorDefined {
 *     struct PaymentFee *opDefCharge1;
 *     struct PaymentFee *opDefCharge2;
 *     struct PaymentFee *opDefCharge3;
 *     struct PaymentFee *opDefCharge4;
 *     struct PaymentFee *opDefCharge5;
 *     struct PaymentFee *opDefCharge6;
 *     struct PaymentFee *opDefCharge7;
 *     struct PaymentFee *opDefCharge8;
 *     struct PaymentFee *opDefCharge9;
 *     struct PaymentFee *opDefCharge10;
 *     struct PaymentFee *opDefCharge11;
 *     struct PaymentFee *opDefCharge12;
 *     struct PaymentFee *opDefCharge13;
 *     struct PaymentFee *opDefCharge14;
 *     struct PaymentFee *opDefCharge15;
 *     struct PaymentFee *opDefCharge16;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class OperatorDefined {

    OperatorDefined() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("opDefCharge1"),
        MessageFrame_h.C_POINTER.withName("opDefCharge2"),
        MessageFrame_h.C_POINTER.withName("opDefCharge3"),
        MessageFrame_h.C_POINTER.withName("opDefCharge4"),
        MessageFrame_h.C_POINTER.withName("opDefCharge5"),
        MessageFrame_h.C_POINTER.withName("opDefCharge6"),
        MessageFrame_h.C_POINTER.withName("opDefCharge7"),
        MessageFrame_h.C_POINTER.withName("opDefCharge8"),
        MessageFrame_h.C_POINTER.withName("opDefCharge9"),
        MessageFrame_h.C_POINTER.withName("opDefCharge10"),
        MessageFrame_h.C_POINTER.withName("opDefCharge11"),
        MessageFrame_h.C_POINTER.withName("opDefCharge12"),
        MessageFrame_h.C_POINTER.withName("opDefCharge13"),
        MessageFrame_h.C_POINTER.withName("opDefCharge14"),
        MessageFrame_h.C_POINTER.withName("opDefCharge15"),
        MessageFrame_h.C_POINTER.withName("opDefCharge16"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("OperatorDefined");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout opDefCharge1$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("opDefCharge1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge1
     * }
     */
    public static final AddressLayout opDefCharge1$layout() {
        return opDefCharge1$LAYOUT;
    }

    private static final long opDefCharge1$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge1
     * }
     */
    public static final long opDefCharge1$offset() {
        return opDefCharge1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge1
     * }
     */
    public static MemorySegment opDefCharge1(MemorySegment struct) {
        return struct.get(opDefCharge1$LAYOUT, opDefCharge1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge1
     * }
     */
    public static void opDefCharge1(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(opDefCharge1$LAYOUT, opDefCharge1$OFFSET, fieldValue);
    }

    private static final AddressLayout opDefCharge2$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("opDefCharge2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge2
     * }
     */
    public static final AddressLayout opDefCharge2$layout() {
        return opDefCharge2$LAYOUT;
    }

    private static final long opDefCharge2$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge2
     * }
     */
    public static final long opDefCharge2$offset() {
        return opDefCharge2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge2
     * }
     */
    public static MemorySegment opDefCharge2(MemorySegment struct) {
        return struct.get(opDefCharge2$LAYOUT, opDefCharge2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge2
     * }
     */
    public static void opDefCharge2(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(opDefCharge2$LAYOUT, opDefCharge2$OFFSET, fieldValue);
    }

    private static final AddressLayout opDefCharge3$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("opDefCharge3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge3
     * }
     */
    public static final AddressLayout opDefCharge3$layout() {
        return opDefCharge3$LAYOUT;
    }

    private static final long opDefCharge3$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge3
     * }
     */
    public static final long opDefCharge3$offset() {
        return opDefCharge3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge3
     * }
     */
    public static MemorySegment opDefCharge3(MemorySegment struct) {
        return struct.get(opDefCharge3$LAYOUT, opDefCharge3$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge3
     * }
     */
    public static void opDefCharge3(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(opDefCharge3$LAYOUT, opDefCharge3$OFFSET, fieldValue);
    }

    private static final AddressLayout opDefCharge4$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("opDefCharge4"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge4
     * }
     */
    public static final AddressLayout opDefCharge4$layout() {
        return opDefCharge4$LAYOUT;
    }

    private static final long opDefCharge4$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge4
     * }
     */
    public static final long opDefCharge4$offset() {
        return opDefCharge4$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge4
     * }
     */
    public static MemorySegment opDefCharge4(MemorySegment struct) {
        return struct.get(opDefCharge4$LAYOUT, opDefCharge4$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge4
     * }
     */
    public static void opDefCharge4(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(opDefCharge4$LAYOUT, opDefCharge4$OFFSET, fieldValue);
    }

    private static final AddressLayout opDefCharge5$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("opDefCharge5"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge5
     * }
     */
    public static final AddressLayout opDefCharge5$layout() {
        return opDefCharge5$LAYOUT;
    }

    private static final long opDefCharge5$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge5
     * }
     */
    public static final long opDefCharge5$offset() {
        return opDefCharge5$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge5
     * }
     */
    public static MemorySegment opDefCharge5(MemorySegment struct) {
        return struct.get(opDefCharge5$LAYOUT, opDefCharge5$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge5
     * }
     */
    public static void opDefCharge5(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(opDefCharge5$LAYOUT, opDefCharge5$OFFSET, fieldValue);
    }

    private static final AddressLayout opDefCharge6$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("opDefCharge6"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge6
     * }
     */
    public static final AddressLayout opDefCharge6$layout() {
        return opDefCharge6$LAYOUT;
    }

    private static final long opDefCharge6$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge6
     * }
     */
    public static final long opDefCharge6$offset() {
        return opDefCharge6$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge6
     * }
     */
    public static MemorySegment opDefCharge6(MemorySegment struct) {
        return struct.get(opDefCharge6$LAYOUT, opDefCharge6$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge6
     * }
     */
    public static void opDefCharge6(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(opDefCharge6$LAYOUT, opDefCharge6$OFFSET, fieldValue);
    }

    private static final AddressLayout opDefCharge7$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("opDefCharge7"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge7
     * }
     */
    public static final AddressLayout opDefCharge7$layout() {
        return opDefCharge7$LAYOUT;
    }

    private static final long opDefCharge7$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge7
     * }
     */
    public static final long opDefCharge7$offset() {
        return opDefCharge7$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge7
     * }
     */
    public static MemorySegment opDefCharge7(MemorySegment struct) {
        return struct.get(opDefCharge7$LAYOUT, opDefCharge7$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge7
     * }
     */
    public static void opDefCharge7(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(opDefCharge7$LAYOUT, opDefCharge7$OFFSET, fieldValue);
    }

    private static final AddressLayout opDefCharge8$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("opDefCharge8"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge8
     * }
     */
    public static final AddressLayout opDefCharge8$layout() {
        return opDefCharge8$LAYOUT;
    }

    private static final long opDefCharge8$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge8
     * }
     */
    public static final long opDefCharge8$offset() {
        return opDefCharge8$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge8
     * }
     */
    public static MemorySegment opDefCharge8(MemorySegment struct) {
        return struct.get(opDefCharge8$LAYOUT, opDefCharge8$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge8
     * }
     */
    public static void opDefCharge8(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(opDefCharge8$LAYOUT, opDefCharge8$OFFSET, fieldValue);
    }

    private static final AddressLayout opDefCharge9$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("opDefCharge9"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge9
     * }
     */
    public static final AddressLayout opDefCharge9$layout() {
        return opDefCharge9$LAYOUT;
    }

    private static final long opDefCharge9$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge9
     * }
     */
    public static final long opDefCharge9$offset() {
        return opDefCharge9$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge9
     * }
     */
    public static MemorySegment opDefCharge9(MemorySegment struct) {
        return struct.get(opDefCharge9$LAYOUT, opDefCharge9$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge9
     * }
     */
    public static void opDefCharge9(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(opDefCharge9$LAYOUT, opDefCharge9$OFFSET, fieldValue);
    }

    private static final AddressLayout opDefCharge10$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("opDefCharge10"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge10
     * }
     */
    public static final AddressLayout opDefCharge10$layout() {
        return opDefCharge10$LAYOUT;
    }

    private static final long opDefCharge10$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge10
     * }
     */
    public static final long opDefCharge10$offset() {
        return opDefCharge10$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge10
     * }
     */
    public static MemorySegment opDefCharge10(MemorySegment struct) {
        return struct.get(opDefCharge10$LAYOUT, opDefCharge10$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge10
     * }
     */
    public static void opDefCharge10(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(opDefCharge10$LAYOUT, opDefCharge10$OFFSET, fieldValue);
    }

    private static final AddressLayout opDefCharge11$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("opDefCharge11"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge11
     * }
     */
    public static final AddressLayout opDefCharge11$layout() {
        return opDefCharge11$LAYOUT;
    }

    private static final long opDefCharge11$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge11
     * }
     */
    public static final long opDefCharge11$offset() {
        return opDefCharge11$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge11
     * }
     */
    public static MemorySegment opDefCharge11(MemorySegment struct) {
        return struct.get(opDefCharge11$LAYOUT, opDefCharge11$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge11
     * }
     */
    public static void opDefCharge11(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(opDefCharge11$LAYOUT, opDefCharge11$OFFSET, fieldValue);
    }

    private static final AddressLayout opDefCharge12$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("opDefCharge12"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge12
     * }
     */
    public static final AddressLayout opDefCharge12$layout() {
        return opDefCharge12$LAYOUT;
    }

    private static final long opDefCharge12$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge12
     * }
     */
    public static final long opDefCharge12$offset() {
        return opDefCharge12$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge12
     * }
     */
    public static MemorySegment opDefCharge12(MemorySegment struct) {
        return struct.get(opDefCharge12$LAYOUT, opDefCharge12$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge12
     * }
     */
    public static void opDefCharge12(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(opDefCharge12$LAYOUT, opDefCharge12$OFFSET, fieldValue);
    }

    private static final AddressLayout opDefCharge13$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("opDefCharge13"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge13
     * }
     */
    public static final AddressLayout opDefCharge13$layout() {
        return opDefCharge13$LAYOUT;
    }

    private static final long opDefCharge13$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge13
     * }
     */
    public static final long opDefCharge13$offset() {
        return opDefCharge13$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge13
     * }
     */
    public static MemorySegment opDefCharge13(MemorySegment struct) {
        return struct.get(opDefCharge13$LAYOUT, opDefCharge13$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge13
     * }
     */
    public static void opDefCharge13(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(opDefCharge13$LAYOUT, opDefCharge13$OFFSET, fieldValue);
    }

    private static final AddressLayout opDefCharge14$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("opDefCharge14"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge14
     * }
     */
    public static final AddressLayout opDefCharge14$layout() {
        return opDefCharge14$LAYOUT;
    }

    private static final long opDefCharge14$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge14
     * }
     */
    public static final long opDefCharge14$offset() {
        return opDefCharge14$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge14
     * }
     */
    public static MemorySegment opDefCharge14(MemorySegment struct) {
        return struct.get(opDefCharge14$LAYOUT, opDefCharge14$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge14
     * }
     */
    public static void opDefCharge14(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(opDefCharge14$LAYOUT, opDefCharge14$OFFSET, fieldValue);
    }

    private static final AddressLayout opDefCharge15$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("opDefCharge15"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge15
     * }
     */
    public static final AddressLayout opDefCharge15$layout() {
        return opDefCharge15$LAYOUT;
    }

    private static final long opDefCharge15$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge15
     * }
     */
    public static final long opDefCharge15$offset() {
        return opDefCharge15$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge15
     * }
     */
    public static MemorySegment opDefCharge15(MemorySegment struct) {
        return struct.get(opDefCharge15$LAYOUT, opDefCharge15$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge15
     * }
     */
    public static void opDefCharge15(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(opDefCharge15$LAYOUT, opDefCharge15$OFFSET, fieldValue);
    }

    private static final AddressLayout opDefCharge16$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("opDefCharge16"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge16
     * }
     */
    public static final AddressLayout opDefCharge16$layout() {
        return opDefCharge16$LAYOUT;
    }

    private static final long opDefCharge16$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge16
     * }
     */
    public static final long opDefCharge16$offset() {
        return opDefCharge16$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge16
     * }
     */
    public static MemorySegment opDefCharge16(MemorySegment struct) {
        return struct.get(opDefCharge16$LAYOUT, opDefCharge16$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct PaymentFee *opDefCharge16
     * }
     */
    public static void opDefCharge16(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(opDefCharge16$LAYOUT, opDefCharge16$OFFSET, fieldValue);
    }

    private static final GroupLayout _asn_ctx$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("_asn_ctx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static final GroupLayout _asn_ctx$layout() {
        return _asn_ctx$LAYOUT;
    }

    private static final long _asn_ctx$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static final long _asn_ctx$offset() {
        return _asn_ctx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static MemorySegment _asn_ctx(MemorySegment struct) {
        return struct.asSlice(_asn_ctx$OFFSET, _asn_ctx$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * asn_struct_ctx_t _asn_ctx
     * }
     */
    public static void _asn_ctx(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, _asn_ctx$OFFSET, _asn_ctx$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

