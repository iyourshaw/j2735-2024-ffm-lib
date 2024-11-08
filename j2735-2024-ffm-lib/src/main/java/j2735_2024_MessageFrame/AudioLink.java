// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct AudioLink {
 *     long *amChannel;
 *     long *fmChannel;
 *     long *satelliteChannel;
 *     IA5String_t *urlChannel;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class AudioLink {

    AudioLink() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("amChannel"),
        MessageFrame_h.C_POINTER.withName("fmChannel"),
        MessageFrame_h.C_POINTER.withName("satelliteChannel"),
        MessageFrame_h.C_POINTER.withName("urlChannel"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("AudioLink");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout amChannel$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("amChannel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long *amChannel
     * }
     */
    public static final AddressLayout amChannel$layout() {
        return amChannel$LAYOUT;
    }

    private static final long amChannel$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long *amChannel
     * }
     */
    public static final long amChannel$offset() {
        return amChannel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long *amChannel
     * }
     */
    public static MemorySegment amChannel(MemorySegment struct) {
        return struct.get(amChannel$LAYOUT, amChannel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long *amChannel
     * }
     */
    public static void amChannel(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(amChannel$LAYOUT, amChannel$OFFSET, fieldValue);
    }

    private static final AddressLayout fmChannel$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("fmChannel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long *fmChannel
     * }
     */
    public static final AddressLayout fmChannel$layout() {
        return fmChannel$LAYOUT;
    }

    private static final long fmChannel$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long *fmChannel
     * }
     */
    public static final long fmChannel$offset() {
        return fmChannel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long *fmChannel
     * }
     */
    public static MemorySegment fmChannel(MemorySegment struct) {
        return struct.get(fmChannel$LAYOUT, fmChannel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long *fmChannel
     * }
     */
    public static void fmChannel(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(fmChannel$LAYOUT, fmChannel$OFFSET, fieldValue);
    }

    private static final AddressLayout satelliteChannel$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("satelliteChannel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long *satelliteChannel
     * }
     */
    public static final AddressLayout satelliteChannel$layout() {
        return satelliteChannel$LAYOUT;
    }

    private static final long satelliteChannel$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long *satelliteChannel
     * }
     */
    public static final long satelliteChannel$offset() {
        return satelliteChannel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long *satelliteChannel
     * }
     */
    public static MemorySegment satelliteChannel(MemorySegment struct) {
        return struct.get(satelliteChannel$LAYOUT, satelliteChannel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long *satelliteChannel
     * }
     */
    public static void satelliteChannel(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(satelliteChannel$LAYOUT, satelliteChannel$OFFSET, fieldValue);
    }

    private static final AddressLayout urlChannel$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("urlChannel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * IA5String_t *urlChannel
     * }
     */
    public static final AddressLayout urlChannel$layout() {
        return urlChannel$LAYOUT;
    }

    private static final long urlChannel$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * IA5String_t *urlChannel
     * }
     */
    public static final long urlChannel$offset() {
        return urlChannel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * IA5String_t *urlChannel
     * }
     */
    public static MemorySegment urlChannel(MemorySegment struct) {
        return struct.get(urlChannel$LAYOUT, urlChannel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * IA5String_t *urlChannel
     * }
     */
    public static void urlChannel(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(urlChannel$LAYOUT, urlChannel$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 32;

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
