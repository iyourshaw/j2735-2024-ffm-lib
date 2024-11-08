// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct RptDriverAlertsAndWarnings {
 *     RptDriverAlertsAndWarnings_PR present;
 *     union RptDriverAlertsAndWarnings_u {
 *         NULL_t j2945Slash1Eebl;
 *         NULL_t j2945Slash1Fcw;
 *         NULL_t j2945Slash1BswLcw;
 *         NULL_t j2945Slash1Ima;
 *         NULL_t j2945Slash1Lta;
 *         NULL_t j2945Slash1Clw;
 *         NULL_t redLightViolationWarn;
 *         NULL_t emerVehAlert;
 *         NULL_t otherAlert;
 *         NULL_t otherWarning;
 *     } choice;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class RptDriverAlertsAndWarnings {

    RptDriverAlertsAndWarnings() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_INT.withName("present"),
        RptDriverAlertsAndWarnings_u.layout().withName("choice"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("RptDriverAlertsAndWarnings");

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
     * RptDriverAlertsAndWarnings_PR present
     * }
     */
    public static final OfInt present$layout() {
        return present$LAYOUT;
    }

    private static final long present$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RptDriverAlertsAndWarnings_PR present
     * }
     */
    public static final long present$offset() {
        return present$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RptDriverAlertsAndWarnings_PR present
     * }
     */
    public static int present(MemorySegment struct) {
        return struct.get(present$LAYOUT, present$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RptDriverAlertsAndWarnings_PR present
     * }
     */
    public static void present(MemorySegment struct, int fieldValue) {
        struct.set(present$LAYOUT, present$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union RptDriverAlertsAndWarnings_u {
     *     NULL_t j2945Slash1Eebl;
     *     NULL_t j2945Slash1Fcw;
     *     NULL_t j2945Slash1BswLcw;
     *     NULL_t j2945Slash1Ima;
     *     NULL_t j2945Slash1Lta;
     *     NULL_t j2945Slash1Clw;
     *     NULL_t redLightViolationWarn;
     *     NULL_t emerVehAlert;
     *     NULL_t otherAlert;
     *     NULL_t otherWarning;
     * }
     * }
     */
    public static class RptDriverAlertsAndWarnings_u {

        RptDriverAlertsAndWarnings_u() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            MessageFrame_h.C_INT.withName("j2945Slash1Eebl"),
            MessageFrame_h.C_INT.withName("j2945Slash1Fcw"),
            MessageFrame_h.C_INT.withName("j2945Slash1BswLcw"),
            MessageFrame_h.C_INT.withName("j2945Slash1Ima"),
            MessageFrame_h.C_INT.withName("j2945Slash1Lta"),
            MessageFrame_h.C_INT.withName("j2945Slash1Clw"),
            MessageFrame_h.C_INT.withName("redLightViolationWarn"),
            MessageFrame_h.C_INT.withName("emerVehAlert"),
            MessageFrame_h.C_INT.withName("otherAlert"),
            MessageFrame_h.C_INT.withName("otherWarning")
        ).withName("RptDriverAlertsAndWarnings_u");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt j2945Slash1Eebl$LAYOUT = (OfInt)$LAYOUT.select(groupElement("j2945Slash1Eebl"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Eebl
         * }
         */
        public static final OfInt j2945Slash1Eebl$layout() {
            return j2945Slash1Eebl$LAYOUT;
        }

        private static final long j2945Slash1Eebl$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Eebl
         * }
         */
        public static final long j2945Slash1Eebl$offset() {
            return j2945Slash1Eebl$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Eebl
         * }
         */
        public static int j2945Slash1Eebl(MemorySegment union) {
            return union.get(j2945Slash1Eebl$LAYOUT, j2945Slash1Eebl$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Eebl
         * }
         */
        public static void j2945Slash1Eebl(MemorySegment union, int fieldValue) {
            union.set(j2945Slash1Eebl$LAYOUT, j2945Slash1Eebl$OFFSET, fieldValue);
        }

        private static final OfInt j2945Slash1Fcw$LAYOUT = (OfInt)$LAYOUT.select(groupElement("j2945Slash1Fcw"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Fcw
         * }
         */
        public static final OfInt j2945Slash1Fcw$layout() {
            return j2945Slash1Fcw$LAYOUT;
        }

        private static final long j2945Slash1Fcw$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Fcw
         * }
         */
        public static final long j2945Slash1Fcw$offset() {
            return j2945Slash1Fcw$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Fcw
         * }
         */
        public static int j2945Slash1Fcw(MemorySegment union) {
            return union.get(j2945Slash1Fcw$LAYOUT, j2945Slash1Fcw$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Fcw
         * }
         */
        public static void j2945Slash1Fcw(MemorySegment union, int fieldValue) {
            union.set(j2945Slash1Fcw$LAYOUT, j2945Slash1Fcw$OFFSET, fieldValue);
        }

        private static final OfInt j2945Slash1BswLcw$LAYOUT = (OfInt)$LAYOUT.select(groupElement("j2945Slash1BswLcw"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1BswLcw
         * }
         */
        public static final OfInt j2945Slash1BswLcw$layout() {
            return j2945Slash1BswLcw$LAYOUT;
        }

        private static final long j2945Slash1BswLcw$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1BswLcw
         * }
         */
        public static final long j2945Slash1BswLcw$offset() {
            return j2945Slash1BswLcw$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1BswLcw
         * }
         */
        public static int j2945Slash1BswLcw(MemorySegment union) {
            return union.get(j2945Slash1BswLcw$LAYOUT, j2945Slash1BswLcw$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1BswLcw
         * }
         */
        public static void j2945Slash1BswLcw(MemorySegment union, int fieldValue) {
            union.set(j2945Slash1BswLcw$LAYOUT, j2945Slash1BswLcw$OFFSET, fieldValue);
        }

        private static final OfInt j2945Slash1Ima$LAYOUT = (OfInt)$LAYOUT.select(groupElement("j2945Slash1Ima"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Ima
         * }
         */
        public static final OfInt j2945Slash1Ima$layout() {
            return j2945Slash1Ima$LAYOUT;
        }

        private static final long j2945Slash1Ima$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Ima
         * }
         */
        public static final long j2945Slash1Ima$offset() {
            return j2945Slash1Ima$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Ima
         * }
         */
        public static int j2945Slash1Ima(MemorySegment union) {
            return union.get(j2945Slash1Ima$LAYOUT, j2945Slash1Ima$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Ima
         * }
         */
        public static void j2945Slash1Ima(MemorySegment union, int fieldValue) {
            union.set(j2945Slash1Ima$LAYOUT, j2945Slash1Ima$OFFSET, fieldValue);
        }

        private static final OfInt j2945Slash1Lta$LAYOUT = (OfInt)$LAYOUT.select(groupElement("j2945Slash1Lta"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Lta
         * }
         */
        public static final OfInt j2945Slash1Lta$layout() {
            return j2945Slash1Lta$LAYOUT;
        }

        private static final long j2945Slash1Lta$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Lta
         * }
         */
        public static final long j2945Slash1Lta$offset() {
            return j2945Slash1Lta$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Lta
         * }
         */
        public static int j2945Slash1Lta(MemorySegment union) {
            return union.get(j2945Slash1Lta$LAYOUT, j2945Slash1Lta$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Lta
         * }
         */
        public static void j2945Slash1Lta(MemorySegment union, int fieldValue) {
            union.set(j2945Slash1Lta$LAYOUT, j2945Slash1Lta$OFFSET, fieldValue);
        }

        private static final OfInt j2945Slash1Clw$LAYOUT = (OfInt)$LAYOUT.select(groupElement("j2945Slash1Clw"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Clw
         * }
         */
        public static final OfInt j2945Slash1Clw$layout() {
            return j2945Slash1Clw$LAYOUT;
        }

        private static final long j2945Slash1Clw$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Clw
         * }
         */
        public static final long j2945Slash1Clw$offset() {
            return j2945Slash1Clw$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Clw
         * }
         */
        public static int j2945Slash1Clw(MemorySegment union) {
            return union.get(j2945Slash1Clw$LAYOUT, j2945Slash1Clw$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t j2945Slash1Clw
         * }
         */
        public static void j2945Slash1Clw(MemorySegment union, int fieldValue) {
            union.set(j2945Slash1Clw$LAYOUT, j2945Slash1Clw$OFFSET, fieldValue);
        }

        private static final OfInt redLightViolationWarn$LAYOUT = (OfInt)$LAYOUT.select(groupElement("redLightViolationWarn"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t redLightViolationWarn
         * }
         */
        public static final OfInt redLightViolationWarn$layout() {
            return redLightViolationWarn$LAYOUT;
        }

        private static final long redLightViolationWarn$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t redLightViolationWarn
         * }
         */
        public static final long redLightViolationWarn$offset() {
            return redLightViolationWarn$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t redLightViolationWarn
         * }
         */
        public static int redLightViolationWarn(MemorySegment union) {
            return union.get(redLightViolationWarn$LAYOUT, redLightViolationWarn$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t redLightViolationWarn
         * }
         */
        public static void redLightViolationWarn(MemorySegment union, int fieldValue) {
            union.set(redLightViolationWarn$LAYOUT, redLightViolationWarn$OFFSET, fieldValue);
        }

        private static final OfInt emerVehAlert$LAYOUT = (OfInt)$LAYOUT.select(groupElement("emerVehAlert"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t emerVehAlert
         * }
         */
        public static final OfInt emerVehAlert$layout() {
            return emerVehAlert$LAYOUT;
        }

        private static final long emerVehAlert$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t emerVehAlert
         * }
         */
        public static final long emerVehAlert$offset() {
            return emerVehAlert$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t emerVehAlert
         * }
         */
        public static int emerVehAlert(MemorySegment union) {
            return union.get(emerVehAlert$LAYOUT, emerVehAlert$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t emerVehAlert
         * }
         */
        public static void emerVehAlert(MemorySegment union, int fieldValue) {
            union.set(emerVehAlert$LAYOUT, emerVehAlert$OFFSET, fieldValue);
        }

        private static final OfInt otherAlert$LAYOUT = (OfInt)$LAYOUT.select(groupElement("otherAlert"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t otherAlert
         * }
         */
        public static final OfInt otherAlert$layout() {
            return otherAlert$LAYOUT;
        }

        private static final long otherAlert$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t otherAlert
         * }
         */
        public static final long otherAlert$offset() {
            return otherAlert$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t otherAlert
         * }
         */
        public static int otherAlert(MemorySegment union) {
            return union.get(otherAlert$LAYOUT, otherAlert$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t otherAlert
         * }
         */
        public static void otherAlert(MemorySegment union, int fieldValue) {
            union.set(otherAlert$LAYOUT, otherAlert$OFFSET, fieldValue);
        }

        private static final OfInt otherWarning$LAYOUT = (OfInt)$LAYOUT.select(groupElement("otherWarning"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t otherWarning
         * }
         */
        public static final OfInt otherWarning$layout() {
            return otherWarning$LAYOUT;
        }

        private static final long otherWarning$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t otherWarning
         * }
         */
        public static final long otherWarning$offset() {
            return otherWarning$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t otherWarning
         * }
         */
        public static int otherWarning(MemorySegment union) {
            return union.get(otherWarning$LAYOUT, otherWarning$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t otherWarning
         * }
         */
        public static void otherWarning(MemorySegment union, int fieldValue) {
            union.set(otherWarning$LAYOUT, otherWarning$OFFSET, fieldValue);
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
     * union RptDriverAlertsAndWarnings_u choice
     * }
     */
    public static final GroupLayout choice$layout() {
        return choice$LAYOUT;
    }

    private static final long choice$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union RptDriverAlertsAndWarnings_u choice
     * }
     */
    public static final long choice$offset() {
        return choice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union RptDriverAlertsAndWarnings_u choice
     * }
     */
    public static MemorySegment choice(MemorySegment struct) {
        return struct.asSlice(choice$OFFSET, choice$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union RptDriverAlertsAndWarnings_u choice
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

    private static final long _asn_ctx$OFFSET = 8;

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

