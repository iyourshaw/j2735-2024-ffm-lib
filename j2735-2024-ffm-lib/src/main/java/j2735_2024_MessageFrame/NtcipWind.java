// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct NtcipWind {
 *     NTCIPWindSensorAvgSpeed_t *avgSpeed;
 *     NTCIPWindSensorAvgDirection_t *avgDirection;
 *     NTCIPWindSensorSpotSpeed_t *currentSpeed;
 *     NTCIPWindSensorSpotDirection_t *curDirection;
 *     NTCIPWindSensorGustSpeed_t *gustSpeed;
 *     NTCIPWindSensorGustDirection_t *gustDirection;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class NtcipWind {

    NtcipWind() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_POINTER.withName("avgSpeed"),
        MessageFrame_h.C_POINTER.withName("avgDirection"),
        MessageFrame_h.C_POINTER.withName("currentSpeed"),
        MessageFrame_h.C_POINTER.withName("curDirection"),
        MessageFrame_h.C_POINTER.withName("gustSpeed"),
        MessageFrame_h.C_POINTER.withName("gustDirection"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("NtcipWind");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout avgSpeed$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("avgSpeed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * NTCIPWindSensorAvgSpeed_t *avgSpeed
     * }
     */
    public static final AddressLayout avgSpeed$layout() {
        return avgSpeed$LAYOUT;
    }

    private static final long avgSpeed$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * NTCIPWindSensorAvgSpeed_t *avgSpeed
     * }
     */
    public static final long avgSpeed$offset() {
        return avgSpeed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * NTCIPWindSensorAvgSpeed_t *avgSpeed
     * }
     */
    public static MemorySegment avgSpeed(MemorySegment struct) {
        return struct.get(avgSpeed$LAYOUT, avgSpeed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * NTCIPWindSensorAvgSpeed_t *avgSpeed
     * }
     */
    public static void avgSpeed(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(avgSpeed$LAYOUT, avgSpeed$OFFSET, fieldValue);
    }

    private static final AddressLayout avgDirection$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("avgDirection"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * NTCIPWindSensorAvgDirection_t *avgDirection
     * }
     */
    public static final AddressLayout avgDirection$layout() {
        return avgDirection$LAYOUT;
    }

    private static final long avgDirection$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * NTCIPWindSensorAvgDirection_t *avgDirection
     * }
     */
    public static final long avgDirection$offset() {
        return avgDirection$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * NTCIPWindSensorAvgDirection_t *avgDirection
     * }
     */
    public static MemorySegment avgDirection(MemorySegment struct) {
        return struct.get(avgDirection$LAYOUT, avgDirection$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * NTCIPWindSensorAvgDirection_t *avgDirection
     * }
     */
    public static void avgDirection(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(avgDirection$LAYOUT, avgDirection$OFFSET, fieldValue);
    }

    private static final AddressLayout currentSpeed$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("currentSpeed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * NTCIPWindSensorSpotSpeed_t *currentSpeed
     * }
     */
    public static final AddressLayout currentSpeed$layout() {
        return currentSpeed$LAYOUT;
    }

    private static final long currentSpeed$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * NTCIPWindSensorSpotSpeed_t *currentSpeed
     * }
     */
    public static final long currentSpeed$offset() {
        return currentSpeed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * NTCIPWindSensorSpotSpeed_t *currentSpeed
     * }
     */
    public static MemorySegment currentSpeed(MemorySegment struct) {
        return struct.get(currentSpeed$LAYOUT, currentSpeed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * NTCIPWindSensorSpotSpeed_t *currentSpeed
     * }
     */
    public static void currentSpeed(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(currentSpeed$LAYOUT, currentSpeed$OFFSET, fieldValue);
    }

    private static final AddressLayout curDirection$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("curDirection"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * NTCIPWindSensorSpotDirection_t *curDirection
     * }
     */
    public static final AddressLayout curDirection$layout() {
        return curDirection$LAYOUT;
    }

    private static final long curDirection$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * NTCIPWindSensorSpotDirection_t *curDirection
     * }
     */
    public static final long curDirection$offset() {
        return curDirection$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * NTCIPWindSensorSpotDirection_t *curDirection
     * }
     */
    public static MemorySegment curDirection(MemorySegment struct) {
        return struct.get(curDirection$LAYOUT, curDirection$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * NTCIPWindSensorSpotDirection_t *curDirection
     * }
     */
    public static void curDirection(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(curDirection$LAYOUT, curDirection$OFFSET, fieldValue);
    }

    private static final AddressLayout gustSpeed$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("gustSpeed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * NTCIPWindSensorGustSpeed_t *gustSpeed
     * }
     */
    public static final AddressLayout gustSpeed$layout() {
        return gustSpeed$LAYOUT;
    }

    private static final long gustSpeed$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * NTCIPWindSensorGustSpeed_t *gustSpeed
     * }
     */
    public static final long gustSpeed$offset() {
        return gustSpeed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * NTCIPWindSensorGustSpeed_t *gustSpeed
     * }
     */
    public static MemorySegment gustSpeed(MemorySegment struct) {
        return struct.get(gustSpeed$LAYOUT, gustSpeed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * NTCIPWindSensorGustSpeed_t *gustSpeed
     * }
     */
    public static void gustSpeed(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(gustSpeed$LAYOUT, gustSpeed$OFFSET, fieldValue);
    }

    private static final AddressLayout gustDirection$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("gustDirection"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * NTCIPWindSensorGustDirection_t *gustDirection
     * }
     */
    public static final AddressLayout gustDirection$layout() {
        return gustDirection$LAYOUT;
    }

    private static final long gustDirection$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * NTCIPWindSensorGustDirection_t *gustDirection
     * }
     */
    public static final long gustDirection$offset() {
        return gustDirection$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * NTCIPWindSensorGustDirection_t *gustDirection
     * }
     */
    public static MemorySegment gustDirection(MemorySegment struct) {
        return struct.get(gustDirection$LAYOUT, gustDirection$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * NTCIPWindSensorGustDirection_t *gustDirection
     * }
     */
    public static void gustDirection(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(gustDirection$LAYOUT, gustDirection$OFFSET, fieldValue);
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

    private static final long _asn_ctx$OFFSET = 48;

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

