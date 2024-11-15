// Generated by jextract

package j2735_2024_MessageFrame;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct RptRoadwayEvents {
 *     RptRoadwayEvents_PR present;
 *     union RptRoadwayEvents_u {
 *         NULL_t obstacleDetected;
 *         RptRoadRoughness_t adverseRoadSurface;
 *         RptTrafficSigEncounters_t trfsigEncounters;
 *         NULL_t trfsigLightOut;
 *         NULL_t trfsigRoadGeoMismatch;
 *         NULL_t roadsignDetection;
 *         NULL_t lowRoadsignReflect;
 *         NULL_t lowLaneMarkReflect;
 *         NULL_t roadsignIncnstncy;
 *         NULL_t laneGeoIncnstncy;
 *         NULL_t incidentDetect;
 *         NULL_t workZoneCharDetect;
 *         NULL_t inclWeatherDetect;
 *         NULL_t railrdCrossActiv;
 *         NULL_t drawBridgeActiv;
 *     } choice;
 *     asn_struct_ctx_t _asn_ctx;
 * }
 * }
 */
public class RptRoadwayEvents {

    RptRoadwayEvents() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MessageFrame_h.C_INT.withName("present"),
        MemoryLayout.paddingLayout(4),
        RptRoadwayEvents_u.layout().withName("choice"),
        asn_struct_ctx_s.layout().withName("_asn_ctx")
    ).withName("RptRoadwayEvents");

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
     * RptRoadwayEvents_PR present
     * }
     */
    public static final OfInt present$layout() {
        return present$LAYOUT;
    }

    private static final long present$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RptRoadwayEvents_PR present
     * }
     */
    public static final long present$offset() {
        return present$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RptRoadwayEvents_PR present
     * }
     */
    public static int present(MemorySegment struct) {
        return struct.get(present$LAYOUT, present$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RptRoadwayEvents_PR present
     * }
     */
    public static void present(MemorySegment struct, int fieldValue) {
        struct.set(present$LAYOUT, present$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union RptRoadwayEvents_u {
     *     NULL_t obstacleDetected;
     *     RptRoadRoughness_t adverseRoadSurface;
     *     RptTrafficSigEncounters_t trfsigEncounters;
     *     NULL_t trfsigLightOut;
     *     NULL_t trfsigRoadGeoMismatch;
     *     NULL_t roadsignDetection;
     *     NULL_t lowRoadsignReflect;
     *     NULL_t lowLaneMarkReflect;
     *     NULL_t roadsignIncnstncy;
     *     NULL_t laneGeoIncnstncy;
     *     NULL_t incidentDetect;
     *     NULL_t workZoneCharDetect;
     *     NULL_t inclWeatherDetect;
     *     NULL_t railrdCrossActiv;
     *     NULL_t drawBridgeActiv;
     * }
     * }
     */
    public static class RptRoadwayEvents_u {

        RptRoadwayEvents_u() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            MessageFrame_h.C_INT.withName("obstacleDetected"),
            RptRoadRoughness.layout().withName("adverseRoadSurface"),
            RptTrafficSigEncounters.layout().withName("trfsigEncounters"),
            MessageFrame_h.C_INT.withName("trfsigLightOut"),
            MessageFrame_h.C_INT.withName("trfsigRoadGeoMismatch"),
            MessageFrame_h.C_INT.withName("roadsignDetection"),
            MessageFrame_h.C_INT.withName("lowRoadsignReflect"),
            MessageFrame_h.C_INT.withName("lowLaneMarkReflect"),
            MessageFrame_h.C_INT.withName("roadsignIncnstncy"),
            MessageFrame_h.C_INT.withName("laneGeoIncnstncy"),
            MessageFrame_h.C_INT.withName("incidentDetect"),
            MessageFrame_h.C_INT.withName("workZoneCharDetect"),
            MessageFrame_h.C_INT.withName("inclWeatherDetect"),
            MessageFrame_h.C_INT.withName("railrdCrossActiv"),
            MessageFrame_h.C_INT.withName("drawBridgeActiv")
        ).withName("RptRoadwayEvents_u");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt obstacleDetected$LAYOUT = (OfInt)$LAYOUT.select(groupElement("obstacleDetected"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t obstacleDetected
         * }
         */
        public static final OfInt obstacleDetected$layout() {
            return obstacleDetected$LAYOUT;
        }

        private static final long obstacleDetected$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t obstacleDetected
         * }
         */
        public static final long obstacleDetected$offset() {
            return obstacleDetected$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t obstacleDetected
         * }
         */
        public static int obstacleDetected(MemorySegment union) {
            return union.get(obstacleDetected$LAYOUT, obstacleDetected$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t obstacleDetected
         * }
         */
        public static void obstacleDetected(MemorySegment union, int fieldValue) {
            union.set(obstacleDetected$LAYOUT, obstacleDetected$OFFSET, fieldValue);
        }

        private static final GroupLayout adverseRoadSurface$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("adverseRoadSurface"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * RptRoadRoughness_t adverseRoadSurface
         * }
         */
        public static final GroupLayout adverseRoadSurface$layout() {
            return adverseRoadSurface$LAYOUT;
        }

        private static final long adverseRoadSurface$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * RptRoadRoughness_t adverseRoadSurface
         * }
         */
        public static final long adverseRoadSurface$offset() {
            return adverseRoadSurface$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * RptRoadRoughness_t adverseRoadSurface
         * }
         */
        public static MemorySegment adverseRoadSurface(MemorySegment union) {
            return union.asSlice(adverseRoadSurface$OFFSET, adverseRoadSurface$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * RptRoadRoughness_t adverseRoadSurface
         * }
         */
        public static void adverseRoadSurface(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, adverseRoadSurface$OFFSET, adverseRoadSurface$LAYOUT.byteSize());
        }

        private static final GroupLayout trfsigEncounters$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("trfsigEncounters"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * RptTrafficSigEncounters_t trfsigEncounters
         * }
         */
        public static final GroupLayout trfsigEncounters$layout() {
            return trfsigEncounters$LAYOUT;
        }

        private static final long trfsigEncounters$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * RptTrafficSigEncounters_t trfsigEncounters
         * }
         */
        public static final long trfsigEncounters$offset() {
            return trfsigEncounters$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * RptTrafficSigEncounters_t trfsigEncounters
         * }
         */
        public static MemorySegment trfsigEncounters(MemorySegment union) {
            return union.asSlice(trfsigEncounters$OFFSET, trfsigEncounters$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * RptTrafficSigEncounters_t trfsigEncounters
         * }
         */
        public static void trfsigEncounters(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, trfsigEncounters$OFFSET, trfsigEncounters$LAYOUT.byteSize());
        }

        private static final OfInt trfsigLightOut$LAYOUT = (OfInt)$LAYOUT.select(groupElement("trfsigLightOut"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t trfsigLightOut
         * }
         */
        public static final OfInt trfsigLightOut$layout() {
            return trfsigLightOut$LAYOUT;
        }

        private static final long trfsigLightOut$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t trfsigLightOut
         * }
         */
        public static final long trfsigLightOut$offset() {
            return trfsigLightOut$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t trfsigLightOut
         * }
         */
        public static int trfsigLightOut(MemorySegment union) {
            return union.get(trfsigLightOut$LAYOUT, trfsigLightOut$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t trfsigLightOut
         * }
         */
        public static void trfsigLightOut(MemorySegment union, int fieldValue) {
            union.set(trfsigLightOut$LAYOUT, trfsigLightOut$OFFSET, fieldValue);
        }

        private static final OfInt trfsigRoadGeoMismatch$LAYOUT = (OfInt)$LAYOUT.select(groupElement("trfsigRoadGeoMismatch"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t trfsigRoadGeoMismatch
         * }
         */
        public static final OfInt trfsigRoadGeoMismatch$layout() {
            return trfsigRoadGeoMismatch$LAYOUT;
        }

        private static final long trfsigRoadGeoMismatch$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t trfsigRoadGeoMismatch
         * }
         */
        public static final long trfsigRoadGeoMismatch$offset() {
            return trfsigRoadGeoMismatch$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t trfsigRoadGeoMismatch
         * }
         */
        public static int trfsigRoadGeoMismatch(MemorySegment union) {
            return union.get(trfsigRoadGeoMismatch$LAYOUT, trfsigRoadGeoMismatch$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t trfsigRoadGeoMismatch
         * }
         */
        public static void trfsigRoadGeoMismatch(MemorySegment union, int fieldValue) {
            union.set(trfsigRoadGeoMismatch$LAYOUT, trfsigRoadGeoMismatch$OFFSET, fieldValue);
        }

        private static final OfInt roadsignDetection$LAYOUT = (OfInt)$LAYOUT.select(groupElement("roadsignDetection"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t roadsignDetection
         * }
         */
        public static final OfInt roadsignDetection$layout() {
            return roadsignDetection$LAYOUT;
        }

        private static final long roadsignDetection$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t roadsignDetection
         * }
         */
        public static final long roadsignDetection$offset() {
            return roadsignDetection$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t roadsignDetection
         * }
         */
        public static int roadsignDetection(MemorySegment union) {
            return union.get(roadsignDetection$LAYOUT, roadsignDetection$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t roadsignDetection
         * }
         */
        public static void roadsignDetection(MemorySegment union, int fieldValue) {
            union.set(roadsignDetection$LAYOUT, roadsignDetection$OFFSET, fieldValue);
        }

        private static final OfInt lowRoadsignReflect$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lowRoadsignReflect"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t lowRoadsignReflect
         * }
         */
        public static final OfInt lowRoadsignReflect$layout() {
            return lowRoadsignReflect$LAYOUT;
        }

        private static final long lowRoadsignReflect$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t lowRoadsignReflect
         * }
         */
        public static final long lowRoadsignReflect$offset() {
            return lowRoadsignReflect$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t lowRoadsignReflect
         * }
         */
        public static int lowRoadsignReflect(MemorySegment union) {
            return union.get(lowRoadsignReflect$LAYOUT, lowRoadsignReflect$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t lowRoadsignReflect
         * }
         */
        public static void lowRoadsignReflect(MemorySegment union, int fieldValue) {
            union.set(lowRoadsignReflect$LAYOUT, lowRoadsignReflect$OFFSET, fieldValue);
        }

        private static final OfInt lowLaneMarkReflect$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lowLaneMarkReflect"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t lowLaneMarkReflect
         * }
         */
        public static final OfInt lowLaneMarkReflect$layout() {
            return lowLaneMarkReflect$LAYOUT;
        }

        private static final long lowLaneMarkReflect$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t lowLaneMarkReflect
         * }
         */
        public static final long lowLaneMarkReflect$offset() {
            return lowLaneMarkReflect$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t lowLaneMarkReflect
         * }
         */
        public static int lowLaneMarkReflect(MemorySegment union) {
            return union.get(lowLaneMarkReflect$LAYOUT, lowLaneMarkReflect$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t lowLaneMarkReflect
         * }
         */
        public static void lowLaneMarkReflect(MemorySegment union, int fieldValue) {
            union.set(lowLaneMarkReflect$LAYOUT, lowLaneMarkReflect$OFFSET, fieldValue);
        }

        private static final OfInt roadsignIncnstncy$LAYOUT = (OfInt)$LAYOUT.select(groupElement("roadsignIncnstncy"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t roadsignIncnstncy
         * }
         */
        public static final OfInt roadsignIncnstncy$layout() {
            return roadsignIncnstncy$LAYOUT;
        }

        private static final long roadsignIncnstncy$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t roadsignIncnstncy
         * }
         */
        public static final long roadsignIncnstncy$offset() {
            return roadsignIncnstncy$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t roadsignIncnstncy
         * }
         */
        public static int roadsignIncnstncy(MemorySegment union) {
            return union.get(roadsignIncnstncy$LAYOUT, roadsignIncnstncy$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t roadsignIncnstncy
         * }
         */
        public static void roadsignIncnstncy(MemorySegment union, int fieldValue) {
            union.set(roadsignIncnstncy$LAYOUT, roadsignIncnstncy$OFFSET, fieldValue);
        }

        private static final OfInt laneGeoIncnstncy$LAYOUT = (OfInt)$LAYOUT.select(groupElement("laneGeoIncnstncy"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t laneGeoIncnstncy
         * }
         */
        public static final OfInt laneGeoIncnstncy$layout() {
            return laneGeoIncnstncy$LAYOUT;
        }

        private static final long laneGeoIncnstncy$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t laneGeoIncnstncy
         * }
         */
        public static final long laneGeoIncnstncy$offset() {
            return laneGeoIncnstncy$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t laneGeoIncnstncy
         * }
         */
        public static int laneGeoIncnstncy(MemorySegment union) {
            return union.get(laneGeoIncnstncy$LAYOUT, laneGeoIncnstncy$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t laneGeoIncnstncy
         * }
         */
        public static void laneGeoIncnstncy(MemorySegment union, int fieldValue) {
            union.set(laneGeoIncnstncy$LAYOUT, laneGeoIncnstncy$OFFSET, fieldValue);
        }

        private static final OfInt incidentDetect$LAYOUT = (OfInt)$LAYOUT.select(groupElement("incidentDetect"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t incidentDetect
         * }
         */
        public static final OfInt incidentDetect$layout() {
            return incidentDetect$LAYOUT;
        }

        private static final long incidentDetect$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t incidentDetect
         * }
         */
        public static final long incidentDetect$offset() {
            return incidentDetect$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t incidentDetect
         * }
         */
        public static int incidentDetect(MemorySegment union) {
            return union.get(incidentDetect$LAYOUT, incidentDetect$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t incidentDetect
         * }
         */
        public static void incidentDetect(MemorySegment union, int fieldValue) {
            union.set(incidentDetect$LAYOUT, incidentDetect$OFFSET, fieldValue);
        }

        private static final OfInt workZoneCharDetect$LAYOUT = (OfInt)$LAYOUT.select(groupElement("workZoneCharDetect"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t workZoneCharDetect
         * }
         */
        public static final OfInt workZoneCharDetect$layout() {
            return workZoneCharDetect$LAYOUT;
        }

        private static final long workZoneCharDetect$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t workZoneCharDetect
         * }
         */
        public static final long workZoneCharDetect$offset() {
            return workZoneCharDetect$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t workZoneCharDetect
         * }
         */
        public static int workZoneCharDetect(MemorySegment union) {
            return union.get(workZoneCharDetect$LAYOUT, workZoneCharDetect$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t workZoneCharDetect
         * }
         */
        public static void workZoneCharDetect(MemorySegment union, int fieldValue) {
            union.set(workZoneCharDetect$LAYOUT, workZoneCharDetect$OFFSET, fieldValue);
        }

        private static final OfInt inclWeatherDetect$LAYOUT = (OfInt)$LAYOUT.select(groupElement("inclWeatherDetect"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t inclWeatherDetect
         * }
         */
        public static final OfInt inclWeatherDetect$layout() {
            return inclWeatherDetect$LAYOUT;
        }

        private static final long inclWeatherDetect$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t inclWeatherDetect
         * }
         */
        public static final long inclWeatherDetect$offset() {
            return inclWeatherDetect$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t inclWeatherDetect
         * }
         */
        public static int inclWeatherDetect(MemorySegment union) {
            return union.get(inclWeatherDetect$LAYOUT, inclWeatherDetect$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t inclWeatherDetect
         * }
         */
        public static void inclWeatherDetect(MemorySegment union, int fieldValue) {
            union.set(inclWeatherDetect$LAYOUT, inclWeatherDetect$OFFSET, fieldValue);
        }

        private static final OfInt railrdCrossActiv$LAYOUT = (OfInt)$LAYOUT.select(groupElement("railrdCrossActiv"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t railrdCrossActiv
         * }
         */
        public static final OfInt railrdCrossActiv$layout() {
            return railrdCrossActiv$LAYOUT;
        }

        private static final long railrdCrossActiv$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t railrdCrossActiv
         * }
         */
        public static final long railrdCrossActiv$offset() {
            return railrdCrossActiv$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t railrdCrossActiv
         * }
         */
        public static int railrdCrossActiv(MemorySegment union) {
            return union.get(railrdCrossActiv$LAYOUT, railrdCrossActiv$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t railrdCrossActiv
         * }
         */
        public static void railrdCrossActiv(MemorySegment union, int fieldValue) {
            union.set(railrdCrossActiv$LAYOUT, railrdCrossActiv$OFFSET, fieldValue);
        }

        private static final OfInt drawBridgeActiv$LAYOUT = (OfInt)$LAYOUT.select(groupElement("drawBridgeActiv"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * NULL_t drawBridgeActiv
         * }
         */
        public static final OfInt drawBridgeActiv$layout() {
            return drawBridgeActiv$LAYOUT;
        }

        private static final long drawBridgeActiv$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * NULL_t drawBridgeActiv
         * }
         */
        public static final long drawBridgeActiv$offset() {
            return drawBridgeActiv$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * NULL_t drawBridgeActiv
         * }
         */
        public static int drawBridgeActiv(MemorySegment union) {
            return union.get(drawBridgeActiv$LAYOUT, drawBridgeActiv$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * NULL_t drawBridgeActiv
         * }
         */
        public static void drawBridgeActiv(MemorySegment union, int fieldValue) {
            union.set(drawBridgeActiv$LAYOUT, drawBridgeActiv$OFFSET, fieldValue);
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
     * union RptRoadwayEvents_u choice
     * }
     */
    public static final GroupLayout choice$layout() {
        return choice$LAYOUT;
    }

    private static final long choice$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union RptRoadwayEvents_u choice
     * }
     */
    public static final long choice$offset() {
        return choice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union RptRoadwayEvents_u choice
     * }
     */
    public static MemorySegment choice(MemorySegment struct) {
        return struct.asSlice(choice$OFFSET, choice$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union RptRoadwayEvents_u choice
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

    private static final long _asn_ctx$OFFSET = 72;

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

