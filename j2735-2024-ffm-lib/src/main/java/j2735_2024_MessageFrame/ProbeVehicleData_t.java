// Generated by jextract

package j2735_2024_MessageFrame;

/**
 * {@snippet lang=c :
 * typedef struct ProbeVehicleData {
 *     MinuteOfTheYear_t *timeStamp;
 *     ProbeSegmentNumber_t *segNum;
 *     struct VehicleIdent *probeID;
 *     FullPositionVector_t startVector;
 *     VehicleClassification_t vehicleType;
 *     struct ProbeVehicleData__snapshots {
 *         struct {
 *             struct Snapshot **array;
 *             int count;
 *             int size;
 *             void (*free)(struct Snapshot *);
 *         } list;
 *         asn_struct_ctx_t _asn_ctx;
 *     } snapshots;
 *     struct ProbeVehicleData__regional {
 *         struct {
 *             struct Reg_ProbeVehicleData **array;
 *             int count;
 *             int size;
 *             void (*free)(struct Reg_ProbeVehicleData *);
 *         } list;
 *         asn_struct_ctx_t _asn_ctx;
 *     } *regional;
 *     asn_struct_ctx_t _asn_ctx;
 * } ProbeVehicleData_t
 * }
 */
public class ProbeVehicleData_t extends ProbeVehicleData {

    ProbeVehicleData_t() {
        // Should not be called directly
    }
}
