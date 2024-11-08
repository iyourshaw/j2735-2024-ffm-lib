// Generated by jextract

package j2735_2024_MessageFrame;

/**
 * {@snippet lang=c :
 * typedef struct TrailerUnitDescription {
 *     IsDolly_t isDolly;
 *     VehicleWidth_t width;
 *     VehicleLength_t length;
 *     VehicleHeight_t *height;
 *     TrailerMass_t *mass;
 *     struct BumperHeights *bumperHeights;
 *     VehicleHeight_t *centerOfGravity;
 *     PivotPointDescription_t frontPivot;
 *     struct PivotPointDescription *rearPivot;
 *     Offset_B12_t *rearWheelOffset;
 *     Node_XY_24b_t positionOffset;
 *     VertOffset_B07_t *elevationOffset;
 *     struct TrailerHistoryPointList *crumbData;
 *     asn_struct_ctx_t _asn_ctx;
 * } TrailerUnitDescription_t
 * }
 */
public class TrailerUnitDescription_t extends TrailerUnitDescription {

    TrailerUnitDescription_t() {
        // Should not be called directly
    }
}
