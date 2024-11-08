// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct RptCommSysPerfEvents {
 *     RptCommSysPerfEvents_PR present;
 *     union RptCommSysPerfEvents_u {
 *         NULL_t j2945_1ChanBusy;
 *         OCTET_STRING_t rfDataRsuInfo;
 *         long numOfRsusObserved;
 *         NULL_t rfV2xJamDetect;
 *         NULL_t j2945_1VehDens;
 *         NULL_t j2945_1CqiBelow;
 *         NULL_t j2945_1TrackingError;
 *         NULL_t gnssHdopExceeds;
 *         NULL_t gnssErrElipse;
 *         NULL_t gnssSatsBelow;
 *         NULL_t jammingDetect;
 *     } choice;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class RptCommSysPerfEvents {

    RptCommSysPerfEvents() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_INT.withName("present"),
        MemoryLayout.paddingLayout(4),
        RptCommSysPerfEvents_u.layout().withName("choice"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("RptCommSysPerfEvents");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt present$LAYOUT = (OfInt)$LAYOUT.select(groupElement("present"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RptCommSysPerfEvents_PR present
     * }
     */
    public static final OfInt present$layout() {
        return present$LAYOUT;
    }

    private static final long present$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RptCommSysPerfEvents_PR present
     * }
     */
    public static final long present$offset() {
        return present$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RptCommSysPerfEvents_PR present
     * }
     */
    public static int present(MemorySegment struct) {
        return struct.get(present$LAYOUT, present$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RptCommSysPerfEvents_PR present
     * }
     */
    public static void present(MemorySegment struct, int fieldValue) {
        struct.set(present$LAYOUT, present$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union RptCommSysPerfEvents_u {
     *     NULL_t j2945_1ChanBusy;
     *     OCTET_STRING_t rfDataRsuInfo;
     *     long numOfRsusObserved;
     *     NULL_t rfV2xJamDetect;
     *     NULL_t j2945_1VehDens;
     *     NULL_t j2945_1CqiBelow;
     *     NULL_t j2945_1TrackingError;
     *     NULL_t gnssHdopExceeds;
     *     NULL_t gnssErrElipse;
     *     NULL_t gnssSatsBelow;
     *     NULL_t jammingDetect;
     * }
     * }
     */
    public static class RptCommSysPerfEvents_u {

        RptCommSysPerfEvents_u() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            MessageFrame_h.C_INT.withName("j2945_1ChanBusy"),
            OCTET_STRING.layout().withName("rfDataRsuInfo"),
            MessageFrame_h.C_LONG.withName("numOfRsusObserved"),
            MessageFrame_h.C_INT.withName("rfV2xJamDetect"),
            MessageFrame_h.C_INT.withName("j2945_1VehDens"),
            MessageFrame_h.C_INT.withName("j2945_1CqiBelow"),
            MessageFrame_h.C_INT.withName("j2945_1TrackingError"),
            MessageFrame_h.C_INT.withName("gnssHdopExceeds"),
            MessageFrame_h.C_INT.withName("gnssErrElipse"),
            MessageFrame_h.C_INT.withName("gnssSatsBelow"),
            MessageFrame_h.C_INT.withName("jammingDetect")
        ).withName("RptCommSysPerfEvents_u");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt j2945_1ChanBusy$LAYOUT = (OfInt)$LAYOUT.select(groupElement("j2945_1ChanBusy"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t j2945_1ChanBusy
         * }
         */
        public static final OfInt j2945_1ChanBusy$layout() {
            return j2945_1ChanBusy$LAYOUT;
        }

        private static final long j2945_1ChanBusy$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t j2945_1ChanBusy
         * }
         */
        public static final long j2945_1ChanBusy$offset() {
            return j2945_1ChanBusy$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t j2945_1ChanBusy
         * }
         */
        public static int j2945_1ChanBusy(MemorySegment union) {
            return union.get(j2945_1ChanBusy$LAYOUT, j2945_1ChanBusy$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t j2945_1ChanBusy
         * }
         */
        public static void j2945_1ChanBusy(MemorySegment union, int fieldValue) {
            union.set(j2945_1ChanBusy$LAYOUT, j2945_1ChanBusy$OFFSET, fieldValue);
        }

        private static final GroupLayout rfDataRsuInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rfDataRsuInfo"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * OCTET_STRING_t rfDataRsuInfo
         * }
         */
        public static final GroupLayout rfDataRsuInfo$layout() {
            return rfDataRsuInfo$LAYOUT;
        }

        private static final long rfDataRsuInfo$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * OCTET_STRING_t rfDataRsuInfo
         * }
         */
        public static final long rfDataRsuInfo$offset() {
            return rfDataRsuInfo$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * OCTET_STRING_t rfDataRsuInfo
         * }
         */
        public static MemorySegment rfDataRsuInfo(MemorySegment union) {
            return union.asSlice(rfDataRsuInfo$OFFSET, rfDataRsuInfo$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * OCTET_STRING_t rfDataRsuInfo
         * }
         */
        public static void rfDataRsuInfo(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, rfDataRsuInfo$OFFSET, rfDataRsuInfo$LAYOUT.byteSize());
        }

        private static final OfLong numOfRsusObserved$LAYOUT = (OfLong)$LAYOUT.select(groupElement("numOfRsusObserved"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * long numOfRsusObserved
         * }
         */
        public static final OfLong numOfRsusObserved$layout() {
            return numOfRsusObserved$LAYOUT;
        }

        private static final long numOfRsusObserved$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * long numOfRsusObserved
         * }
         */
        public static final long numOfRsusObserved$offset() {
            return numOfRsusObserved$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * long numOfRsusObserved
         * }
         */
        public static long numOfRsusObserved(MemorySegment union) {
            return union.get(numOfRsusObserved$LAYOUT, numOfRsusObserved$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * long numOfRsusObserved
         * }
         */
        public static void numOfRsusObserved(MemorySegment union, long fieldValue) {
            union.set(numOfRsusObserved$LAYOUT, numOfRsusObserved$OFFSET, fieldValue);
        }

        private static final OfInt rfV2xJamDetect$LAYOUT = (OfInt)$LAYOUT.select(groupElement("rfV2xJamDetect"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t rfV2xJamDetect
         * }
         */
        public static final OfInt rfV2xJamDetect$layout() {
            return rfV2xJamDetect$LAYOUT;
        }

        private static final long rfV2xJamDetect$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t rfV2xJamDetect
         * }
         */
        public static final long rfV2xJamDetect$offset() {
            return rfV2xJamDetect$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t rfV2xJamDetect
         * }
         */
        public static int rfV2xJamDetect(MemorySegment union) {
            return union.get(rfV2xJamDetect$LAYOUT, rfV2xJamDetect$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t rfV2xJamDetect
         * }
         */
        public static void rfV2xJamDetect(MemorySegment union, int fieldValue) {
            union.set(rfV2xJamDetect$LAYOUT, rfV2xJamDetect$OFFSET, fieldValue);
        }

        private static final OfInt j2945_1VehDens$LAYOUT = (OfInt)$LAYOUT.select(groupElement("j2945_1VehDens"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t j2945_1VehDens
         * }
         */
        public static final OfInt j2945_1VehDens$layout() {
            return j2945_1VehDens$LAYOUT;
        }

        private static final long j2945_1VehDens$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t j2945_1VehDens
         * }
         */
        public static final long j2945_1VehDens$offset() {
            return j2945_1VehDens$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t j2945_1VehDens
         * }
         */
        public static int j2945_1VehDens(MemorySegment union) {
            return union.get(j2945_1VehDens$LAYOUT, j2945_1VehDens$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t j2945_1VehDens
         * }
         */
        public static void j2945_1VehDens(MemorySegment union, int fieldValue) {
            union.set(j2945_1VehDens$LAYOUT, j2945_1VehDens$OFFSET, fieldValue);
        }

        private static final OfInt j2945_1CqiBelow$LAYOUT = (OfInt)$LAYOUT.select(groupElement("j2945_1CqiBelow"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t j2945_1CqiBelow
         * }
         */
        public static final OfInt j2945_1CqiBelow$layout() {
            return j2945_1CqiBelow$LAYOUT;
        }

        private static final long j2945_1CqiBelow$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t j2945_1CqiBelow
         * }
         */
        public static final long j2945_1CqiBelow$offset() {
            return j2945_1CqiBelow$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t j2945_1CqiBelow
         * }
         */
        public static int j2945_1CqiBelow(MemorySegment union) {
            return union.get(j2945_1CqiBelow$LAYOUT, j2945_1CqiBelow$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t j2945_1CqiBelow
         * }
         */
        public static void j2945_1CqiBelow(MemorySegment union, int fieldValue) {
            union.set(j2945_1CqiBelow$LAYOUT, j2945_1CqiBelow$OFFSET, fieldValue);
        }

        private static final OfInt j2945_1TrackingError$LAYOUT = (OfInt)$LAYOUT.select(groupElement("j2945_1TrackingError"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t j2945_1TrackingError
         * }
         */
        public static final OfInt j2945_1TrackingError$layout() {
            return j2945_1TrackingError$LAYOUT;
        }

        private static final long j2945_1TrackingError$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t j2945_1TrackingError
         * }
         */
        public static final long j2945_1TrackingError$offset() {
            return j2945_1TrackingError$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t j2945_1TrackingError
         * }
         */
        public static int j2945_1TrackingError(MemorySegment union) {
            return union.get(j2945_1TrackingError$LAYOUT, j2945_1TrackingError$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t j2945_1TrackingError
         * }
         */
        public static void j2945_1TrackingError(MemorySegment union, int fieldValue) {
            union.set(j2945_1TrackingError$LAYOUT, j2945_1TrackingError$OFFSET, fieldValue);
        }

        private static final OfInt gnssHdopExceeds$LAYOUT = (OfInt)$LAYOUT.select(groupElement("gnssHdopExceeds"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t gnssHdopExceeds
         * }
         */
        public static final OfInt gnssHdopExceeds$layout() {
            return gnssHdopExceeds$LAYOUT;
        }

        private static final long gnssHdopExceeds$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t gnssHdopExceeds
         * }
         */
        public static final long gnssHdopExceeds$offset() {
            return gnssHdopExceeds$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t gnssHdopExceeds
         * }
         */
        public static int gnssHdopExceeds(MemorySegment union) {
            return union.get(gnssHdopExceeds$LAYOUT, gnssHdopExceeds$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t gnssHdopExceeds
         * }
         */
        public static void gnssHdopExceeds(MemorySegment union, int fieldValue) {
            union.set(gnssHdopExceeds$LAYOUT, gnssHdopExceeds$OFFSET, fieldValue);
        }

        private static final OfInt gnssErrElipse$LAYOUT = (OfInt)$LAYOUT.select(groupElement("gnssErrElipse"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t gnssErrElipse
         * }
         */
        public static final OfInt gnssErrElipse$layout() {
            return gnssErrElipse$LAYOUT;
        }

        private static final long gnssErrElipse$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t gnssErrElipse
         * }
         */
        public static final long gnssErrElipse$offset() {
            return gnssErrElipse$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t gnssErrElipse
         * }
         */
        public static int gnssErrElipse(MemorySegment union) {
            return union.get(gnssErrElipse$LAYOUT, gnssErrElipse$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t gnssErrElipse
         * }
         */
        public static void gnssErrElipse(MemorySegment union, int fieldValue) {
            union.set(gnssErrElipse$LAYOUT, gnssErrElipse$OFFSET, fieldValue);
        }

        private static final OfInt gnssSatsBelow$LAYOUT = (OfInt)$LAYOUT.select(groupElement("gnssSatsBelow"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t gnssSatsBelow
         * }
         */
        public static final OfInt gnssSatsBelow$layout() {
            return gnssSatsBelow$LAYOUT;
        }

        private static final long gnssSatsBelow$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t gnssSatsBelow
         * }
         */
        public static final long gnssSatsBelow$offset() {
            return gnssSatsBelow$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t gnssSatsBelow
         * }
         */
        public static int gnssSatsBelow(MemorySegment union) {
            return union.get(gnssSatsBelow$LAYOUT, gnssSatsBelow$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t gnssSatsBelow
         * }
         */
        public static void gnssSatsBelow(MemorySegment union, int fieldValue) {
            union.set(gnssSatsBelow$LAYOUT, gnssSatsBelow$OFFSET, fieldValue);
        }

        private static final OfInt jammingDetect$LAYOUT = (OfInt)$LAYOUT.select(groupElement("jammingDetect"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t jammingDetect
         * }
         */
        public static final OfInt jammingDetect$layout() {
            return jammingDetect$LAYOUT;
        }

        private static final long jammingDetect$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t jammingDetect
         * }
         */
        public static final long jammingDetect$offset() {
            return jammingDetect$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t jammingDetect
         * }
         */
        public static int jammingDetect(MemorySegment union) {
            return union.get(jammingDetect$LAYOUT, jammingDetect$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t jammingDetect
         * }
         */
        public static void jammingDetect(MemorySegment union, int fieldValue) {
            union.set(jammingDetect$LAYOUT, jammingDetect$OFFSET, fieldValue);
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
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

    private static final GroupLayout choice$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("choice"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union RptCommSysPerfEvents_u choice
     * }
     */
    public static final GroupLayout choice$layout() {
        return choice$LAYOUT;
    }

    private static final long choice$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union RptCommSysPerfEvents_u choice
     * }
     */
    public static final long choice$offset() {
        return choice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union RptCommSysPerfEvents_u choice
     * }
     */
    public static MemorySegment choice(MemorySegment struct) {
        return struct.asSlice(choice$OFFSET, choice$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union RptCommSysPerfEvents_u choice
     * }
     */
    public static void choice(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, choice$OFFSET, choice$LAYOUT.byteSize());
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
