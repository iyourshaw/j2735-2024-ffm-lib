// Generated by jextract

package j2735_2024_MessageFrame;

/**
 * {@snippet lang=c :
 * typedef struct VehicleIdent {
 *     DescriptiveName_t *name;
 *     VINstring_t *vin;
 *     IA5String_t *ownerCode;
 *     struct VehicleID *id;
 *     VehicleType_t *vehicleType;
 *     struct VehicleIdent__vehicleClass {
 *         VehicleIdent__vehicleClass_PR present;
 *         union VehicleIdent__vehicleClass_u {
 *             ITIS_VehicleGroupAffected_t vGroup;
 *             ITIS_ResponderGroupAffected_t rGroup;
 *             ITIS_IncidentResponseEquipment_t rEquip;
 *         } choice;
 *         asn_struct_ctx_t _asn_ctx;
 *     } *vehicleClass;
 *     asn_struct_ctx_t _asn_ctx;
 * } VehicleIdent_t
 * }
 */
public class VehicleIdent_t extends VehicleIdent {

    VehicleIdent_t() {
        // Should not be called directly
    }
}
