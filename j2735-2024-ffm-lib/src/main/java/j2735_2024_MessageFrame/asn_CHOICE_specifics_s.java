// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct asn_CHOICE_specifics_s {
 *     unsigned int struct_size;
 *     unsigned int ctx_offset;
 *     unsigned int pres_offset;
 *     unsigned int pres_size;
 *     const asn_TYPE_tag2member_t *tag2el;
 *     unsigned int tag2el_count;
 *     const unsigned int *to_canonical_order;
 *     const unsigned int *from_canonical_order;
 *     int ext_start;
 * }
 * }
 */
public class asn_CHOICE_specifics_s {

    asn_CHOICE_specifics_s() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_INT.withName("struct_size"),
        MessageFrame_h.C_INT.withName("ctx_offset"),
        MessageFrame_h.C_INT.withName("pres_offset"),
        MessageFrame_h.C_INT.withName("pres_size"),
        MessageFrame_h.C_POINTER.withName("tag2el"),
        MessageFrame_h.C_INT.withName("tag2el_count"),
        MemoryLayout.paddingLayout(4),
        MessageFrame_h.C_POINTER.withName("to_canonical_order"),
        MessageFrame_h.C_POINTER.withName("from_canonical_order"),
        MessageFrame_h.C_INT.withName("ext_start"),
        MemoryLayout.paddingLayout(4)
    ).withName("asn_CHOICE_specifics_s");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt struct_size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("struct_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int struct_size
     * }
     */
    public static final OfInt struct_size$layout() {
        return struct_size$LAYOUT;
    }

    private static final long struct_size$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int struct_size
     * }
     */
    public static final long struct_size$offset() {
        return struct_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int struct_size
     * }
     */
    public static int struct_size(MemorySegment struct) {
        return struct.get(struct_size$LAYOUT, struct_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int struct_size
     * }
     */
    public static void struct_size(MemorySegment struct, int fieldValue) {
        struct.set(struct_size$LAYOUT, struct_size$OFFSET, fieldValue);
    }

    private static final OfInt ctx_offset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ctx_offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int ctx_offset
     * }
     */
    public static final OfInt ctx_offset$layout() {
        return ctx_offset$LAYOUT;
    }

    private static final long ctx_offset$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int ctx_offset
     * }
     */
    public static final long ctx_offset$offset() {
        return ctx_offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int ctx_offset
     * }
     */
    public static int ctx_offset(MemorySegment struct) {
        return struct.get(ctx_offset$LAYOUT, ctx_offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int ctx_offset
     * }
     */
    public static void ctx_offset(MemorySegment struct, int fieldValue) {
        struct.set(ctx_offset$LAYOUT, ctx_offset$OFFSET, fieldValue);
    }

    private static final OfInt pres_offset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pres_offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int pres_offset
     * }
     */
    public static final OfInt pres_offset$layout() {
        return pres_offset$LAYOUT;
    }

    private static final long pres_offset$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int pres_offset
     * }
     */
    public static final long pres_offset$offset() {
        return pres_offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int pres_offset
     * }
     */
    public static int pres_offset(MemorySegment struct) {
        return struct.get(pres_offset$LAYOUT, pres_offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int pres_offset
     * }
     */
    public static void pres_offset(MemorySegment struct, int fieldValue) {
        struct.set(pres_offset$LAYOUT, pres_offset$OFFSET, fieldValue);
    }

    private static final OfInt pres_size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pres_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int pres_size
     * }
     */
    public static final OfInt pres_size$layout() {
        return pres_size$LAYOUT;
    }

    private static final long pres_size$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int pres_size
     * }
     */
    public static final long pres_size$offset() {
        return pres_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int pres_size
     * }
     */
    public static int pres_size(MemorySegment struct) {
        return struct.get(pres_size$LAYOUT, pres_size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int pres_size
     * }
     */
    public static void pres_size(MemorySegment struct, int fieldValue) {
        struct.set(pres_size$LAYOUT, pres_size$OFFSET, fieldValue);
    }

    private static final AddressLayout tag2el$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("tag2el"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const asn_TYPE_tag2member_t *tag2el
     * }
     */
    public static final AddressLayout tag2el$layout() {
        return tag2el$LAYOUT;
    }

    private static final long tag2el$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const asn_TYPE_tag2member_t *tag2el
     * }
     */
    public static final long tag2el$offset() {
        return tag2el$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const asn_TYPE_tag2member_t *tag2el
     * }
     */
    public static MemorySegment tag2el(MemorySegment struct) {
        return struct.get(tag2el$LAYOUT, tag2el$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const asn_TYPE_tag2member_t *tag2el
     * }
     */
    public static void tag2el(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(tag2el$LAYOUT, tag2el$OFFSET, fieldValue);
    }

    private static final OfInt tag2el_count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tag2el_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int tag2el_count
     * }
     */
    public static final OfInt tag2el_count$layout() {
        return tag2el_count$LAYOUT;
    }

    private static final long tag2el_count$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int tag2el_count
     * }
     */
    public static final long tag2el_count$offset() {
        return tag2el_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int tag2el_count
     * }
     */
    public static int tag2el_count(MemorySegment struct) {
        return struct.get(tag2el_count$LAYOUT, tag2el_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int tag2el_count
     * }
     */
    public static void tag2el_count(MemorySegment struct, int fieldValue) {
        struct.set(tag2el_count$LAYOUT, tag2el_count$OFFSET, fieldValue);
    }

    private static final AddressLayout to_canonical_order$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("to_canonical_order"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const unsigned int *to_canonical_order
     * }
     */
    public static final AddressLayout to_canonical_order$layout() {
        return to_canonical_order$LAYOUT;
    }

    private static final long to_canonical_order$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const unsigned int *to_canonical_order
     * }
     */
    public static final long to_canonical_order$offset() {
        return to_canonical_order$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const unsigned int *to_canonical_order
     * }
     */
    public static MemorySegment to_canonical_order(MemorySegment struct) {
        return struct.get(to_canonical_order$LAYOUT, to_canonical_order$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const unsigned int *to_canonical_order
     * }
     */
    public static void to_canonical_order(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(to_canonical_order$LAYOUT, to_canonical_order$OFFSET, fieldValue);
    }

    private static final AddressLayout from_canonical_order$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("from_canonical_order"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const unsigned int *from_canonical_order
     * }
     */
    public static final AddressLayout from_canonical_order$layout() {
        return from_canonical_order$LAYOUT;
    }

    private static final long from_canonical_order$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const unsigned int *from_canonical_order
     * }
     */
    public static final long from_canonical_order$offset() {
        return from_canonical_order$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const unsigned int *from_canonical_order
     * }
     */
    public static MemorySegment from_canonical_order(MemorySegment struct) {
        return struct.get(from_canonical_order$LAYOUT, from_canonical_order$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const unsigned int *from_canonical_order
     * }
     */
    public static void from_canonical_order(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(from_canonical_order$LAYOUT, from_canonical_order$OFFSET, fieldValue);
    }

    private static final OfInt ext_start$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ext_start"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int ext_start
     * }
     */
    public static final OfInt ext_start$layout() {
        return ext_start$LAYOUT;
    }

    private static final long ext_start$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int ext_start
     * }
     */
    public static final long ext_start$offset() {
        return ext_start$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int ext_start
     * }
     */
    public static int ext_start(MemorySegment struct) {
        return struct.get(ext_start$LAYOUT, ext_start$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int ext_start
     * }
     */
    public static void ext_start(MemorySegment struct, int fieldValue) {
        struct.set(ext_start$LAYOUT, ext_start$OFFSET, fieldValue);
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

