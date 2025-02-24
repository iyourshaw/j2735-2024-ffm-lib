// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct RoadSignID {
 *     Position3D_t position;
 *     HeadingSlice_t viewAngle;
 *     MUTCDCode_t *mutcdCode;
 *     MsgCRC_t *crc;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class RoadSignID {

    RoadSignID() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Position3D.layout().withName("position"),
        BIT_STRING_s.layout().withName("viewAngle"),
        MessageFrame_h.C_POINTER.withName("mutcdCode"),
        MessageFrame_h.C_POINTER.withName("crc"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("RoadSignID");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout position$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("position"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Position3D_t position
     * }
     */
    public static final GroupLayout position$layout() {
        return position$LAYOUT;
    }

    private static final long position$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Position3D_t position
     * }
     */
    public static final long position$offset() {
        return position$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Position3D_t position
     * }
     */
    public static MemorySegment position(MemorySegment struct) {
        return struct.asSlice(position$OFFSET, position$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Position3D_t position
     * }
     */
    public static void position(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, position$OFFSET, position$LAYOUT.byteSize());
    }

    private static final GroupLayout viewAngle$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("viewAngle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HeadingSlice_t viewAngle
     * }
     */
    public static final GroupLayout viewAngle$layout() {
        return viewAngle$LAYOUT;
    }

    private static final long viewAngle$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HeadingSlice_t viewAngle
     * }
     */
    public static final long viewAngle$offset() {
        return viewAngle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HeadingSlice_t viewAngle
     * }
     */
    public static MemorySegment viewAngle(MemorySegment struct) {
        return struct.asSlice(viewAngle$OFFSET, viewAngle$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HeadingSlice_t viewAngle
     * }
     */
    public static void viewAngle(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, viewAngle$OFFSET, viewAngle$LAYOUT.byteSize());
    }

    private static final AddressLayout mutcdCode$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("mutcdCode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * MUTCDCode_t *mutcdCode
     * }
     */
    public static final AddressLayout mutcdCode$layout() {
        return mutcdCode$LAYOUT;
    }

    private static final long mutcdCode$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * MUTCDCode_t *mutcdCode
     * }
     */
    public static final long mutcdCode$offset() {
        return mutcdCode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * MUTCDCode_t *mutcdCode
     * }
     */
    public static MemorySegment mutcdCode(MemorySegment struct) {
        return struct.get(mutcdCode$LAYOUT, mutcdCode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * MUTCDCode_t *mutcdCode
     * }
     */
    public static void mutcdCode(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(mutcdCode$LAYOUT, mutcdCode$OFFSET, fieldValue);
    }

    private static final AddressLayout crc$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("crc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * MsgCRC_t *crc
     * }
     */
    public static final AddressLayout crc$layout() {
        return crc$LAYOUT;
    }

    private static final long crc$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * MsgCRC_t *crc
     * }
     */
    public static final long crc$offset() {
        return crc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * MsgCRC_t *crc
     * }
     */
    public static MemorySegment crc(MemorySegment struct) {
        return struct.get(crc$LAYOUT, crc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * MsgCRC_t *crc
     * }
     */
    public static void crc(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(crc$LAYOUT, crc$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 120;

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

